import React, { Component } from 'react';
import { Link, withRouter } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';
import { Cookies, withCookies } from 'react-cookie';
import { instanceOf } from 'prop-types';
import { Select, MenuItem } from '@material-ui/core';
import authHeader from './auth-header';
class EditItem extends Component {

  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  emptyItem = {
    name: '',
    price:'',
    quantity: ''
  };

  constructor(props) {
    super();
    const {cookies} = props;
    this.state = {
      item: this.emptyItem,
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  async componentDidMount() {
    if (this.props.match.params.id !== 'new') {
      try{
      const item = await (await fetch(`../../api/item/${this.props.match.params.id}`,{headers: authHeader()})).json();
      this.setState({item: item});
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
    await fetch('../../api/item'+ (item.id ? '/' + item.id : ''), {
      method: (item.id) ? 'PUT' : 'POST',
      headers: header,
      body: JSON.stringify(item),
    });
    this.props.history.push('../../dashboard');
  }

  render() {
    const {item,departments} = this.state;
    const title = <h2>{item.id ? 'Edit Item' : 'Add Item'}</h2>;

    return <div>
      <Container>
        {title}
        <hr id="hr2" />
        <Form onSubmit={this.handleSubmit}>
          <FormGroup>
            <Label for="name">Name</Label>
            <Input type="text" name="name" id="name" value={item.name || ''}
                   onChange={this.handleChange} autoComplete="name"/>
          </FormGroup>
          <FormGroup>
            <Label for="price">Price</Label>
            <Input type="number" name="price" id="price" value={item.price || ''}
                   onChange={this.handleChange} autoComplete="price"/>
          </FormGroup>
          <FormGroup>
            <Label for="quantity">Quantity</Label>
            <Input type="quantity" name="quantity" id="quantity" value={item.quantity || ''}
                   onChange={this.handleChange} autoComplete="quantity"/>
          </FormGroup>
          <div className="row">
          </div>
          <FormGroup>
            <Button color="primary" type="submit">Save</Button>{' '}
            <Button color="secondary" tag={Link} to ={"../../dashboard"}>Cancel</Button>
          </FormGroup>
        </Form>
      </Container>
    </div>
  }
}

export default withCookies(withRouter(EditItem));