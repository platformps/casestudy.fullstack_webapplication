import React, { Component } from "react";
import { render } from '@testing-library/react';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import Login from "./login";
import { Button, ButtonGroup, Container, Table ,Form, FormGroup, Input, Label } from 'reactstrap';
import 'bootstrap/dist/css/bootstrap.css';


export default class Registration extends Component {
    render() {
        return (
            <form method="post" action="/form" autoComplete = "off">
            <div>
                <div className="split left">
                    <div className="centered">
                        <h1>
                            Sign up
                </h1>
                        <hr id="hr2" />
                        <Form >
          <FormGroup>
            <Label for="name">Enter Full Name</Label>
            <Input type="text" name="name" id="name" value="name"
                    autoComplete="name"/>
          </FormGroup>
          <FormGroup>
            <Label for="email">Email</Label>
            <Input type="email" name="email" id="email" value="email"
                    autoComplete="email"/>
          </FormGroup>
          <FormGroup>
            <Label for="lastName">Enter Password</Label>
            <Input type="password" name="password" id="password" value="password"
                    autoComplete="password"/>
          </FormGroup>
          <FormGroup>
            <Label for="cpassword">Confirm password</Label>
            <Input type="passowrd" name="cpassword" id="cpassword" value="cpassword"
                   autoComplete="cpassword"/>
          </FormGroup>
          <FormGroup>
            <Button color="primary" tag={Link} to="../">Register</Button>
          </FormGroup>
        </Form>
                        <p>
                            Once you click Register you agree with our Terms and Condtions
                        </p>
                    </div>
                </div>
                <hr id="vl" />
                <div className="split right">
                    <div className="centered">
                        <h1>
                            Already have an account?
                    </h1>
                        <Link className="nav-link" to={"/"}>
                            <Button style = {{backgroundColor: "#2196f3"}}>
                                Login
                    </Button>
                        </Link>
                    </div>
                </div>
            </div>
            </form>
        );
    }
}