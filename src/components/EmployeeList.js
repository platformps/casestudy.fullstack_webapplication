import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table, ListGroup, ListGroupItem } from 'reactstrap';
import { Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import '../viewlist.css';
import EditEmployee from  './EditEmployee';


class EmployeeList extends Component {

  constructor(props) {
    super(props);
    
    this.state = {employee: [], isLoading: true};
    this.remove = this.remove.bind(this);
  }
  

  componentDidMount() {
    this.setState({isLoading: true});

    fetch('../api/employee')
      .then(response => response.json())
      .then(data => this.setState({employee: data, isLoading: false}));
      // console.log(employee);
  }

  async remove(id) {
    await fetch(`../api/employee/${id}`, {
      method: 'DELETE',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
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

export default EmployeeList;