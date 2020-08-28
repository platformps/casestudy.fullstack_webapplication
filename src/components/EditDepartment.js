import React, { Component } from 'react';
import { Link, withRouter } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';

class DepartmentEdit extends Component {

  emptyItem = {
    name: '',
    budget:'',
    manager: '',
  
  };

  constructor(props) {
    super(props);
    this.state = {
      item: this.emptyItem
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  async componentDidMount() {
    if (this.props.match.params.id !== 'new') {
      const department = await (await fetch(`/api/department/${this.props.match.params.id}`)).json();
      this.setState({item: department});
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

    await fetch('../api/department', {
      method: (item.id) ? 'PUT' : 'POST',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(item),
    });
    this.props.history.push('../department');
  }

  render() {
    const {item} = this.state;
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
            <Label for="lastName">Department Manager</Label>
            <Input type="text" name="manager" id="manager" value={item.manager || ''}
                   onChange={this.handleChange} autoComplete="manager"/>
          </FormGroup>
          <FormGroup>
            <Label for="address">Budget</Label>
            <Input type="text" name="budget" id="budget" value={item.budget || ''}
                   onChange={this.handleChange} autoComplete="budget"/>
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

export default withRouter(DepartmentEdit);