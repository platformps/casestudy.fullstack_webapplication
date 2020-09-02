import logo from './logobw.png';
import React, { Component } from "react";
import { render } from '@testing-library/react';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import SignUp from "./signup";
import Dashboard from './dashboard';
import { Button, ButtonGroup, Container, Table,Form, FormGroup, Input, Label } from 'reactstrap';
import 'bootstrap/dist/css/bootstrap.css';

export default class Login extends Component {
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
                    <Link className = "nav-link" to = {"/dashboard"}>
                    <Button style = {{backgroundColor: "#2196f3"}} type="submit"> Sign in</Button>
                    </Link>

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