import React, { Component } from 'react';
import { Link, withRouter } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';
import { Cookies, withCookies } from 'react-cookie';
import { instanceOf } from 'prop-types';

class EmployeeEdit extends Component {

  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  emptyItem = {
    firstName: '',
    lastName:'',
    position: '',
    salary: '',
    department: '',
    email: '',
    password: ''

  };

  constructor(props) {
    super(props);
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
      const employee = await (await fetch(`../../api/employee/${this.props.match.params.id}`,{credentials: 'include'})).json();
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
    const {item,csrfToken} = this.state;

    await fetch('../../api/employee'+ (item.id ? '/' + item.id : ''), {
      method: (item.id) ? 'PUT' : 'POST',
      headers: {
        'X-XSRF-TOKEN': csrfToken,
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(item),
      credentials: 'include'
    });
    this.props.history.push('../employees');
  }

  render() {
    const {item} = this.state;
    const title = <h2>{item.id ? 'Edit Employee' : 'Add Employee'}</h2>;

    return <div>
      <Container>
        {title}
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
          <FormGroup>
            <Label for="city">Department</Label>
            <Input type="text" name="department" id="department" value={item.department || ''}
                   onChange={this.handleChange} autoComplete="department"/>
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

export default withCookies(withRouter(EmployeeEdit));