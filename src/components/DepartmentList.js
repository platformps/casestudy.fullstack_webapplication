import React, { Component } from 'react';
import { Button, ButtonGroup,Table} from 'reactstrap';
import { Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import '../viewlist.css';
import { withCookies} from 'react-cookie';
import {withRouter} from 'react-router-dom'
import authHeader from './auth-header';

class DepartmentList extends Component {



  constructor(props) {
    super();
    this.state = {department: [], isLoading: true};
    this.remove = this.remove.bind(this);
  }
  

  componentDidMount() {
    this.setState({isLoading: true});
    fetch('../api/department',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({department: data, isLoading: false}))
     
  }

  async remove(id) {
    await fetch(`../api/department/${id}`, {
      method: 'DELETE',
      headers: {
        'Authorization':authHeader(),
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
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
          <th>Department Name</th>
          <th>Manger</th>
          <th>Budget</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
      {department.map(department =>
             <tr key={department.id}> 
               <td>{department.name}</td> 
               <td>{department.manager.firstName +  ' ' +department.manager.lastName || 'N/A'} </td>  
               <td>${department.budget || 'N/A'}</td> 
               <td>
                 <ButtonGroup>
                 <Button className="float-right" size="sm" color="primary"   tag={Link} to={this.props.match.path+"/departments/" + department.id}>Edit</Button>
                 <Button className="float-right" size="sm" color="danger" onClick={() => this.remove(department.id)}>Delete</Button>
                </ButtonGroup>
                </td>
              </tr>
            )}
      </tbody>
    </Table>
    <Button className="btn btn-primary" color = "primary" tag={Link} to={this.props.match.path+"/departments/new"}>Add Department</Button>
    </div>
    );
  }
}

export default withCookies(withRouter(DepartmentList));