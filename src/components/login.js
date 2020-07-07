import logo from './logobw.png';
import React, { Component } from "react";
import { render } from '@testing-library/react';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import SignUp from "./signup";
export default class Login extends Component {
    render() {
        return (
            <form>
            <div>
                <img src={logo} className="App-logo" alt="logo" />
                <hr />
                <div>
                    <input type="email" name="email" placeholder="Enter Email"></input>
                </div>

                <div>
                    <input type="password" name="password" placeholder="Enter Password"></input>
                </div>
                <div>
                    <button type="submit" > Sign in</button>

                    <p>Forgot your password? <a href="" > Reset</a></p>
                    <div >
                    <Link className = "nav-link" to = {"/registration"}>
                    <button style = {{backgroundColor: "#2196f3"}} > Create an account</button>
                    </Link>
                     </div>
                </div>
            </div>
            </form>
        );
    }
}