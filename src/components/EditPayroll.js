import React, { Component } from 'react';
import { Link, withRouter } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';
import { Cookies, withCookies } from 'react-cookie';
import { instanceOf } from 'prop-types';

class EditPayroll extends Component {

  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  emptyItem = {
    amount: '',
    employeeId: '',
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
      const payroll = await (await fetch(`../../api/payroll/${this.props.match.params.id}`,{credentials: 'include'})).json();
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
    const {item,csrfToken} = this.state;

    await fetch('../../api/payroll' + (item.id ? '/' + item.id : ''), {
      method: (item.id) ? 'PUT' : 'POST',
      headers: {
        'X-XSRF-TOKEN': csrfToken,
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(item),
      credentials: 'include'
    });
    this.props.history.push('../payroll');
  }

  render() {
    const {item} = this.state;
    const title = <h2>{item.id ? 'Edit Payroll' : 'Add Payroll'}</h2>;

    return <div>
      <Container>
        {title}
        <Form onSubmit={this.handleSubmit}>
          <FormGroup>
            <Label for="employeeId">Employee Id </Label>
            <Input type="text" name="employeeId" id="employeeId" value={item.employeeId || ''}
                   onChange={this.handleChange} autoComplete="employeeId"/>
          </FormGroup>
          <FormGroup>
            <Label for="amount">Amount</Label>
            <Input type="text" name="amount" id="amount" value={item.amount || ''}
                   onChange={this.handleChange} autoComplete="amount"/>
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