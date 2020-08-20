import React, { Component } from "react";
import { render } from '@testing-library/react';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import Login from "./login";
import logo from './logobw.png';
import userLogo from '../img/user-3.png';
import '../Dashboard.css';

export default class Dashboard extends Component{
    render() {
        return(
            <div>
                <div className = "Dashboard-Header">
                <button className = "topBarComp"  onClick ={() => this.props.history.goBack()}> <img   src = {userLogo} /></button>
              </div>

           
            
          <div className = "menuContainer">
            
              <h2>UpKeep Assistant
               <img src={logo} className="App-logo" alt="logo" style = {{height: 100 +'px', width: 100 +'px'}} />
               </h2>
               <div style = {{textAlign: "left", left: 0}}>

                    <button className = "Dashboard-Button" > Dashboard</button>
                
                    <button className = "Dashboard-Button"> Emplyees</button>
            
                    <button className = "Dashboard-Button">Expenses</button>
                
                    <button className = "Dashboard-Button">Expenses</button>
                
                    <button className = "Dashboard-Button">Payroll</button>
               </div>
            
          </div>
          
          </div>
            



           
        );
    }
}