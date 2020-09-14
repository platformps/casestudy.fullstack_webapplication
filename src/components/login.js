import logo from './logobw.png';
import React, { Component } from "react";
import {  Link } from "react-router-dom";
import { Button, Form, FormGroup, Input, Label } from 'reactstrap';
import 'bootstrap/dist/css/bootstrap.css';
import { withCookies } from 'react-cookie';



 class Login extends Component {

    state = {
        isLoading: true,
        isAuthenticated: false,
        user: undefined
      };

      constructor(props) {
        super(props);
        const {cookies} = props;
        this.state.csrfToken = cookies.get('XSRF-TOKEN');
        this.login = this.login.bind(this);
      }

      async componentDidMount() {
        const response = await fetch('/api/user', {credentials: 'include'});
        const body = await response.text();
        if (body === '') {
          this.setState(({isAuthenticated: false}))
        } else {
          this.setState({isAuthenticated: true, user: JSON.parse(body)})
          window.location.pathname = window.location.pathname + 'dashboard';     
        }
      }

      login() {
        let port = (window.location.port ? ':' + window.location.port : '');
        if (port === ':3000') {
          port = ':8080';
        }
        window.location.href = '//' + window.location.hostname + port + '/private';
      }
    render() {
        return (
            <form>
            <div>
                <img src={logo} className="App-logo" alt="logo" />
                <hr />
                <div>
                <Form onSubmit={this.handleSubmit}>
          <FormGroup>
            <Label for="email">Enter Email</Label>
            <Input type="email" name="email" id="email" value= "email"
                   autoComplete="email"/>
          </FormGroup>
          <FormGroup>
            <Label for="password">Password</Label>
            <Input type="password" name="password" id="password" value="password"
                   autoComplete="password"/>
          </FormGroup>
          </Form>
                </div>
                <div>
                    
                    <Button style = {{backgroundColor: "#2196f3"}} onClick = {this.login}  > Sign in</Button>
                    
                    <p>Forgot your password? <a href="" > Reset</a></p>
                    <div >
                    <Link className = "nav-link" to = {"/registration"}>
                    <Button style = {{backgroundColor: "#2196f3"}} > Create an account</Button>
                    </Link>
                     </div>
                </div>
            </div>
            </form>
        );
    }
}
export default withCookies(Login);