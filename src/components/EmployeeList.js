import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table, ListGroup, ListGroupItem} from 'reactstrap';
import { Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import '../viewlist.css';
import { withCookies, Cookies } from 'react-cookie';
import { instanceOf } from 'prop-types';
import {withRouter} from 'react-router-dom'
import authHeader from './auth-header';

class EmployeeList extends Component {
  
  
  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  constructor(props) {
    super();
    this.state = {employee: [],isLoading: true};
    this.remove = this.remove.bind(this);

  }
  

  componentDidMount() {
    this.setState({isLoading: true});
    fetch('../api/employee',{headers: authHeader() })
      .then(response => response.json())
      .then(data => this.setState({employee: data, isLoading: false}))
  }

  async remove(id) {
    await fetch(`../api/employee/${id}`, {
      method: 'DELETE',
      headers: {
        'Authorization':authHeader(),
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
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
      <div >
      <div >
            <h2>Employees  </h2>
            <hr id="hr2" />
          </div>
      <Table className = "container  ">
      <thead>
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Position</th>
          <th>Salary</th>
          <th>Email</th>
          <th>Department</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
      {employee.map(employee =>
             <tr key={employee.id}> 
               <td>{employee.firstName}</td> 
               <td>{employee.lastName}</td>  
               <td>{employee.position}</td> 
               <td>${employee.salary}</td>
               <td> {employee.email}</td>
               <td>{employee.department || 'N/A'}</td>
               <td>
                 <ButtonGroup>
                 <Button className="float-right" size="sm" color="primary"   tag={Link} to={this.props.match.path+"/" + employee.id}>Edit</Button>
                 <Button className="float-right" size="sm" color="danger" onClick={() => this.remove(employee.id)}>Delete</Button>
                </ButtonGroup>
                </td>
              </tr>
            )}
      </tbody>
    </Table>
    <Button className="btn btn-primary" color = "primary" tag={Link} to={this.props.match.path+"/new"}>Add Employee</Button>
    </div>
    );
  }
}

export default withCookies(withRouter(EmployeeList));