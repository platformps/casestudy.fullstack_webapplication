import React, { Component } from 'react';
import { Link, withRouter } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';
import { Cookies, withCookies } from 'react-cookie';
import { instanceOf } from 'prop-types';

class BudgetEdit extends Component {

  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  emptyItem = {
    name: '',
    amount:'',
    manager: '',
    renewDate: '',
  
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
      const department = await (await fetch(`../../api/budget/${this.props.match.params.id}`,{credentials: 'include'})).json();
      this.setState({item: department});
      }
      catch(error){
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

    await fetch('../../api/budget'+ (item.id ? '/' + item.id : ''), {
      method: (item.id) ? 'PUT' : 'POST',
      headers: {
        'X-XSRF-TOKEN': csrfToken,
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(item),
      credentials: 'include'
    });
    this.props.history.push('../budget');
  }

  render() {
    const {item} = this.state;
    const title = <h2>{item.id ? 'Edit Budget' : 'Add Budget'}</h2>;

    return <div>
      <Container>
        {title}
        <Form onSubmit={this.handleSubmit}>
          <FormGroup>
            <Label for="name">Departemnt Name</Label>
            <Input type="text" name="name" id="name" value={item.name || ''}
                   onChange={this.handleChange} autoComplete="name"/>
          </FormGroup>
          <FormGroup>
            <Label for="manager">Budget Manager</Label>
            <Input type="text" name="manager" id="manager" value={item.manager || ''}
                   onChange={this.handleChange} autoComplete="manager"/>
          </FormGroup>
          <FormGroup>
            <Label for="amount">Amount</Label>
            <Input type="text" name="amount" id="amount" value={item.amount || ''}
                   onChange={this.handleChange} autoComplete="amount"/>
          </FormGroup>
          <FormGroup>
            <Label for="renewDate">Renew Date</Label>
            <Input type="date" name="renewDate" id="renewDate" value={item.renewDate || ''}
                   onChange={this.handleChange} autoComplete="renewDate"/>
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

export default withCookies(withRouter(BudgetEdit));