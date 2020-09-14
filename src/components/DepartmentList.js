import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table, ListGroup, ListGroupItem } from 'reactstrap';
import { Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import '../viewlist.css';
import { withCookies, Cookies } from 'react-cookie';
import { instanceOf } from 'prop-types';
import {withRouter} from 'react-router-dom'



class DepartmentList extends Component {

  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  constructor(props) {
    super();
    const {cookies} = props;
    this.state = {department: [],csrfToken: cookies.get('XSRF-TOKEN') , isLoading: true};
    this.remove = this.remove.bind(this);
  }
  

  componentDidMount() {
    this.setState({isLoading: true});
    fetch('../api/department',{credentials: 'include'})
      .then(response => response.json())
      .then(data => this.setState({department: data, isLoading: false}))
      .catch(() => this.props.history.push('../'));
  }

  async remove(id) {
    await fetch(`../api/department/${id}`, {
      method: 'DELETE',
      headers: {
        'X-XSRF-TOKEN': this.state.csrfToken,
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      credentials: 'include'
    }).then(() => {
      let updatedDepartments  = [...this.state.department].filter(i => i.id !== id);
      this.setState({department: updatedDepartments});
    });
  }

  render() {
    const {department, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }
    return (
      <div >
      <div >
            <h2>Departments</h2>
            <hr id="hr2" />
          </div>
      <Table className = "container  ">
      <thead>
        <tr>
          <th>#</th>
          <th>Department Name</th>
          <th>Manger</th>
          <th>Budget</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
      {department.map(department =>
             <tr key={department.id}> 
             <th scope="row">{department.id}</th>
               <td>{department.name}</td> 
               <td>{department.manager.firstName +  ' ' +department.manager.lastName || 'N/A'} </td>  
               <td>${department.budget || 'N/A'}</td> 
               <td>
                 <ButtonGroup>
                 <Button className="float-right" size="sm" color="primary"   tag={Link} to={this.props.match.path+"/" + department.id}>Edit</Button>
                 <Button className="float-right" size="sm" color="danger" onClick={() => this.remove(department.id)}>Delete</Button>
                </ButtonGroup>
                </td>
              </tr>
            )}
      </tbody>
    </Table>
    <Button className="btn btn-primary" color = "primary" tag={Link} to={this.props.match.path+"/new"}>Add Department</Button>
    </div>
    );
  }
}

export default withCookies(withRouter(DepartmentList));