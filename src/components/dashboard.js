import React, { Component } from "react";
import { render } from '@testing-library/react';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import Login from "./login";
import logo from './logobw.png';

export default class Dashboard extends Component{
    render() {
        return(
            <div>

           
            <div>
                
                    <button onClick ={() => this.props.history.goBack()}></button>
            </div>
          <div className = "menuContainer">
            
              <h2>UpKeep Assistant
               <img src={logo} className="App-logo" alt="logo" style = {{height: 100 +'px', width: 100 +'px'}} />
               </h2>
               <ul>
                   <li>
                       ELement 1
                   </li>
                   <li>
                       ELement 1
                   </li>
                   <li>
                       ELement 1
                   </li>
                   <li>
                       ELement 1
                   </li>
               </ul>
            
          </div>
          </div>
            



           
        );
    }
}