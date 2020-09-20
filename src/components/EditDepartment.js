import React, { Component } from 'react';
import { Link, withRouter } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';
import { Cookies, withCookies } from 'react-cookie';
import { instanceOf } from 'prop-types';
import { Select, MenuItem } from '@material-ui/core';
import CurrencyInput from 'react-currency-input';
import authHeader from './auth-header';

class DepartmentEdit extends Component {

  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  emptyItem = {
    name: '',
    manager: {
      id: '',
      firstName: '',
      lastName: '',
    },
    budget : '',
    budgetRenewDate : ' '

  };

  constructor(props) {
    super();
    const {cookies} = props;
    this.state = {
      employees: [],
      item: this.emptyItem,
      csrfToken: cookies.get('XSRF-TOKEN')
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  async componentDidMount() {
    fetch('../../api/employee',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({employees: data}))
    if (this.props.match.params.id !== 'new') {
      try{
      const department = await (await fetch(`../../api/department/${this.props.match.params.id}`,{headers: authHeader()})).json();
      this.setState({item: department});
      console.log(department);
      }catch(error){
        this.props.history.push('../');
      }
    }
  }

  handleChange(event) {
  const {item}  = { ...this.state };
  const currentState = item;
  const { name, value } = event.target;
  currentState[name] = value;
  this.setState({ item: currentState});
  }

  async handleSubmit(event) {
    event.preventDefault();
    const {item} = this.state;
    const header = new Headers(authHeader());
    header.set('Accept', 'application/json');
    header.set('Content-Type', 'application/json');
    await fetch('../../api/department'+ (item.id ? '/' + item.id : ''), {
      method: (item.id) ? 'PUT' : 'POST',
      headers: header,
      body: JSON.stringify(item),
    });
    this.props.history.push('../../dashboard');
  }

  render() {
    const {item,employees} =  this.state;
    const title = <h2>{item.id ? 'Edit Department' : 'Add Department'}</h2>;
    return <div>
      <Container>
        {title}
        <Form onSubmit={this.handleSubmit}>
          <FormGroup>
            <Label for="name">Department Name</Label>
            <Input type="text" name="name" id="name" value={item.name || ''}
                   onChange={this.handleChange} autoComplete="name"/>
          </FormGroup>
          <Label>Department Manager</Label>
          <FormGroup style = {{backgroundColor: 'white'}}>
            <Select
          color = "secondary"  
          labelId="manager"
          id="manager"
          name="manager"
          value={item.manager}
          onChange={this.handleChange}
        >
          {employees.map(employee =>
          <MenuItem onChange={this.handleChange} key={employee.id} value= {employee}>{employee.firstName + ' ' + employee.lastName}</MenuItem>
          )}
        </Select>
          </FormGroup>
          <FormGroup>
            <Label>Budget</Label>
            <Input type="text" id ="budget" name = "budget" value={item.budget|| ''}
                   onChange={this.handleChange} autoComplete={item.budget}/>
          </FormGroup>
          <FormGroup>
            <Label for="budgetRenewDate">Budget Renew Date</Label>
            <Input type="date" name="budgetRenewDate" id="budgetRenewDate" value={item.budgetRenewDate}
                   onChange={this.handleChange} autoComplete="budgetRenewDate"/>
          </FormGroup>
          <FormGroup>
            <Button color="primary" type="submit">Save</Button>{' '}
            <Button color="secondary" tag={Link} to="../../dashboard">Cancel</Button>
          </FormGroup>
        </Form>
      </Container>
    </div>
  }
}

export default withCookies(withRouter(DepartmentEdit));