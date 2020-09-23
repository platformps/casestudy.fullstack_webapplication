import React, { Component } from 'react';
import { Link, withRouter } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';
import { Cookies, withCookies } from 'react-cookie';
import { instanceOf } from 'prop-types';
import { Select, MenuItem } from '@material-ui/core';
import authHeader from './auth-header';

class EditPayroll extends Component {

  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  emptyItem = {
    amount: '',
    employee: '',
    payDate: ''
  };

  constructor(props) {
    super();
    const {cookies} = props;
    this.state = {
      employees:[],
      item: this.emptyItem
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
      const payroll = await (await fetch(`../../api/payroll/${this.props.match.params.id}`,{headers: authHeader()})).json();
      this.setState({item: payroll});
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
    await fetch('../../api/payroll'+ (item.id ? '/' + item.id : ''), {
      method: (item.id) ? 'PUT' : 'POST',
      headers: header,
      body: JSON.stringify(item),
    });
    this.props.history.push('../payroll');
  }

  render() {
    const {item,employees} = this.state;
    const title = <h2>{item.id ? 'Edit Payroll' : 'Add Payroll'}</h2>;
    return <div>
      <Container>
        {title}
        <Form onSubmit={this.handleSubmit}>
        <Label>Employee</Label>
          <FormGroup style = {{backgroundColor: 'white'}}>
            <Select
          color = "secondary"  
          labelId="employee"
          id="employee"
          name="employee"
          value={item.employee}
          onChange={this.handleChange}
        >
          {employees.map(employee =>
          <MenuItem onChange={this.handleChange} key={employee.id} value= {employee}>{employee.firstName + ' ' + employee.lastName}</MenuItem>
          )}
        </Select>
          </FormGroup>
          <FormGroup>
            <Label for="amount">Amount</Label>
            <Input type="text" name="amount" id="amount" value={item.amount || ''}
                   onChange={this.handleChange} autoComplete="amount"/>
          </FormGroup>
          <FormGroup>
            <Label for="payDate">Pay Date</Label>
            <Input type="date" name="payDate" id="payDate" value={item.payDate || ''}
                   onChange={this.handleChange} autoComplete="payDate"/>
          </FormGroup>
          <FormGroup>
            <Button color="primary" type="submit">Save</Button>{' '}
            <Button color="secondary" tag={Link} to ={"../payroll"}>Cancel</Button>
          </FormGroup>
        </Form>
      </Container>
    </div>
  }
}

export default withCookies(withRouter(EditPayroll));