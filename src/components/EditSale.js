import React, { Component } from 'react';
import { Link, withRouter } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';
import { Cookies, withCookies } from 'react-cookie';
import { instanceOf } from 'prop-types';
import { Select, MenuItem } from '@material-ui/core';
import authHeader from './auth-header';


class EditSale extends Component {

  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  emptyItem = {
    amount: '',
    employee: '',
    department: {
      id: '',
      name: '',
      manager: ''
    },
    item: '',
    saleDate: '',
  };


  constructor(props) {
    super();
    this.state = {
      employees: [],
      departments: [],
      items: [],
      item: this.emptyItem
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  async componentDidMount() {
    fetch('../../api/employee',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({employees: data}))
      fetch('../../api/department',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({departments: data}))
      fetch('../../api/item',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({items: data}))
    if (this.props.match.params.id !== 'new') {
      try{
      const sale = await (await fetch(`../../api/sale/${this.props.match.params.id}`,{headers: authHeader()})).json();
      this.setState({item: sale});
      }catch(error){
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
    await fetch('../../api/sale'+ (item.id ? '/' + item.id : ''), {
      method: (item.id) ? 'PUT' : 'POST',
      headers: header,
      body: JSON.stringify(item),
    });
    this.props.history.push('../../dashboard');
  }

  render() {
    const {item,employees,departments,items} = this.state;
    const title = <h2>{item.id ? 'Edit Sale' : 'Add Sale'}</h2>;

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
            <Label for="amount">Ammount of Sale</Label>
            <Input type="text" name="amount" id="amount" value={item.amount || ''}
                   onChange={this.handleChange} autoComplete="amount"/>
          </FormGroup>
          <Label>Product</Label>
          <FormGroup style = {{backgroundColor: 'white'}}>
            <Select
          color = "secondary"  
          labelId="item"
          id="item"
          name="item"
          value={item.item}
          onChange={this.handleChange}
        >
          {items.map(item =>
          <MenuItem onChange={this.handleChange} key={item.id} value={item}>{item.name}</MenuItem>
          )}
        </Select>
          </FormGroup>
          <FormGroup>
            <Label for="saleDate">Sale Date</Label>
            <Input type="date" name="saleDate" id="saleDate" value={item.saleDate || ''}
                   onChange={this.handleChange} autoComplete="saleDate"/>
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
          <MenuItem onChange={this.handleChange} key={department.id} value= {department}>{department.name}</MenuItem>
          )}
        </Select>
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

export default withCookies(withRouter(EditSale));