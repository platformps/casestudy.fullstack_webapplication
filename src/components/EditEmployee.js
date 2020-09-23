import React, { Component } from 'react';
import { Link, withRouter } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';
import { Cookies, withCookies } from 'react-cookie';
import { instanceOf } from 'prop-types';
import { Select, MenuItem } from '@material-ui/core';
import authHeader from './auth-header';
class EmployeeEdit extends Component {

  emptyItem = {
    firstName: '',
    lastName:'',
    position: '',
    salary: '',
    email: '',
    department: ''
  };

  constructor(props) {
    super();
    this.state = {
      departments: [],
      item: this.emptyItem,
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  async componentDidMount() {
    fetch('../../api/department',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({departments: data}))
    if (this.props.match.params.id !== 'new') {
      try{
      const employee = await (await fetch(`../../api/employee/${this.props.match.params.id}`,{headers: authHeader()})).json();
      this.setState({item: employee});
      } catch(error){
        this.props.history.push('../');
      }
    }
  }

  handleChange(event) {
    const target = event.target;
    const value = target.value;
    const name = target.name;
    let item = {...this.state.item};
    item[name] = value;
    this.setState({item});
  }

  async handleSubmit(event) {
    event.preventDefault();
    const {item} = this.state;
    const header = new Headers(authHeader());
    header.set('Accept', 'application/json');
    header.set('Content-Type', 'application/json');
    await fetch('../../api/employee'+ (item.id ? '/' + item.id : ''), {
      method: (item.id) ? 'PUT' : 'POST',
      headers: header,
      body: JSON.stringify(item),
    });
    this.props.history.push('../employees');
  }

  render() {
    const {item,departments} = this.state;
    const title = <h2>{item.id ? 'Edit Employee' : 'Add Employee'}</h2>;

    return <div>
      <Container>
        {title}
        <hr id="hr2" />
        <Form onSubmit={this.handleSubmit}>
          <FormGroup>
            <Label for="firstName">First Name</Label>
            <Input type="text" name="firstName" id="firstName" value={item.firstName || ''}
                   onChange={this.handleChange} autoComplete="firstName"/>
          </FormGroup>
          <FormGroup>
            <Label for="lastName">Last Name</Label>
            <Input type="text" name="lastName" id="lastName" value={item.lastName || ''}
                   onChange={this.handleChange} autoComplete="lastName"/>
          </FormGroup>
          <FormGroup>
            <Label for="email">Email</Label>
            <Input type="email" name="email" id="email" value={item.email || ''}
                   onChange={this.handleChange} autoComplete="email"/>
          </FormGroup>
          <FormGroup>
            <Label for="position">Position</Label>
            <Input type="text" name="position" id="position" value={item.position || ''}
                   onChange={this.handleChange} autoComplete="position"/>
          </FormGroup>
          <Label>Department</Label>
          <FormGroup style = {{backgroundColor: 'white'}}>
            <Select
          color = "secondary"  
          labelId="department"
          id="department"
          name="department"
          value={item.department}
          onChange={this.handleChange}
        >
          {departments.map(department =>
          <MenuItem onChange={this.handleChange} key={department.id} value={department.name}>{department.name}</MenuItem>
          )}
          <MenuItem onChange={this.handleChange}  value={''}>None</MenuItem>
        </Select>
          </FormGroup>
          <div className="row">
            <FormGroup className="col-md-4 mb-3">
              <Label for="stateOrProvince">Salary</Label>
              <Input type="text" name="salary" id="salary" value={item.salary || ''}
                     onChange={this.handleChange} autoComplete="salary"/>
            </FormGroup>
          </div>
          <FormGroup>
            <Button color="primary" type="submit">Save</Button>{' '}
            <Button color="secondary" tag={Link} to ={"../employees"}>Cancel</Button>
          </FormGroup>
        </Form>
      </Container>
    </div>
  }
}

export default EmployeeEdit;