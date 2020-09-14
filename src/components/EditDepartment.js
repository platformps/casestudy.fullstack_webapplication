import React, { Component } from 'react';
import { Link, withRouter } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';
import { Cookies, withCookies } from 'react-cookie';
import { instanceOf } from 'prop-types';


class DepartmentEdit extends Component {

  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  emptyItem = {
    name: '',
    manager: {
      id: '',
      name: '',
    },
    budget : {
      id: '',
      amount: '',
    } ,
    
  };

  constructor(props) {
    super();
    const {cookies} = props;
    this.state = {
      item: this.emptyItem,
      csrfToken: cookies.get('XSRF-TOKEN')
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  async componentDidMount() {
    if (this.props.match.params.id !== 'new') {
      try{
      const department = await (await fetch(`../../api/department/${this.props.match.params.id}`,{credentials: 'include'})).json();
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
  this.setState({ item: currentState });
  }

  async handleSubmit(event) {
    event.preventDefault();
    const {item,csrfToken} = this.state;

    await fetch('../../api/department'+ (item.id ? '/' + item.id : ''), {
      method: (item.id) ? 'PUT' : 'POST',
      headers: {
        'X-XSRF-TOKEN': csrfToken,
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(item),
      credentials: 'include'
    });
    this.props.history.push('../department');
  }

  render() {
    const {item} =  this.state;
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
          <FormGroup>
            <Label>Department Manager First Name</Label>
            <Input type="text" name="managerFirstName" id="managerFirstName" value={item.manager.firstName || ''}
                   onChange={this.handleChange} autoComplete={item.manager.firstName}/>
          </FormGroup>
          <FormGroup>
            <Label>Department Manager Last Name</Label>
            <Input type="text" name="managerLastName" id="managerLastName" value={item.manager.lastName || ''}
                   onChange={this.handleChange} autoComplete={item.manager.lastName}/>
          </FormGroup>
          <FormGroup>
            <Label >Budget ID</Label>
            <Input type="text" name="budgetId" id="budgetId" value={item.budget.id|| ''}
                   onChange={this.handleChange}  autoComplete={item.budget.id}/>
          </FormGroup>
          <FormGroup>
            <Label>Budget</Label>
            <Input type="text" id ="budgetAmount" name = "budgetAmount" value={item.budget.amount|| ''}
                   onChange={this.handleChange} autoComplete={item.budget.amount}/>
          </FormGroup>
          <FormGroup>
            <Button color="primary" type="submit">Save</Button>{' '}
            <Button color="secondary" tag={Link} to="../department">Cancel</Button>
          </FormGroup>
        </Form>
      </Container>
    </div>
  }
}

export default withCookies(withRouter(DepartmentEdit));