import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table, ListGroup, ListGroupItem } from 'reactstrap';
import { Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import '../viewlist.css';
import EditEmployee from  './EditEmployee';
import { withCookies, Cookies } from 'react-cookie';
import { instanceOf } from 'prop-types';
import {withRouter} from 'react-router-dom'


class EmployeeList extends Component {
  
  
  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  constructor(props) {
    super(props);
    const {cookies} = props;
    this.state = {employee: [],csrfToken: cookies.get('XSRF-TOKEN') ,isLoading: true};
    this.remove = this.remove.bind(this);

  }
  

  componentDidMount() {
    this.setState({isLoading: true});
    fetch('../api/employee',{credentials: 'include'})
      .then(response => response.json())
      .then(data => this.setState({employee: data, isLoading: false}))
      .catch(() => this.props.history.push('../'));
  }

  async remove(id) {
    await fetch(`../api/employee/${id}`, {
      method: 'DELETE',
      headers: {
        'X-XSRF-TOKEN': this.state.csrfToken,
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      credentials: 'include'
    }).then(() => {
      let updatedEmployees = [...this.state.employee].filter(i => i.id !== id);
      this.setState({employee: updatedEmployees});
    });
  }

  render() {
    const {employee, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }
    return (
      <div className = "container no-gutters mx-auto">
        <div className = "row no-gutters pb-5 pt-5">
          <div className = "col-4">
           
          </div>
          <div className = "col-4">
            <h5>Employees</h5>
            <hr id="hr2" />
          </div>
          <div className = "col-4">
            <Button className="btn btn-primary" color = "primary" tag={Link} to={this.props.match.path+"/" + employee.id}>+</Button>
          </div>
        </div>
        <div className = "row no-gutters">
          <div className ="col-12 no-gutters pb-5">
             <ul className="list-group">
            {employee.map(employee =>
             <li className="list-group-item" key={employee.id}> 
                {employee.firstName} {employee.lastName} {employee.position}
                <Button className="float-right" size="sm" color="primary"   tag={Link} to={this.props.match.path+"/" + employee.id}>Edit</Button>
                <Button className="float-right" size="sm" color="danger" onClick={() => this.remove(employee.id)}>Delete</Button>
              </li>
              
            )}
            </ul>
          </div>
          </div>
          </div>
    );
  }
}

export default withCookies(withRouter(EmployeeList));