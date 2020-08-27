import React, { Component } from "react";
import { render } from '@testing-library/react';
import { BrowserRouter as Router, Switch, Route, Link, NavLink,useRouteMatch } from "react-router-dom";
import Login from "./login";
import logo from './logobw.png';
import userLogo from '../img/user-3.png';
import '../Dashboard.css';
import EmployeeList from  './EmployeeList';
import { Button, Container } from 'reactstrap';
import EditEmployee from  './EditEmployee';
import  DepartmentList from  './DepartmentList';


class Dashboard extends Component{
    
     
    constructor(props) {
        super(props);
        let match = props.match
        
    }
    
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
                
                    <Link to = {this.props.match.path+"/employees"}><button className = "Dashboard-Button"> Employees</button></Link>

                    <Link to = {this.props.match.path+"/department"}><button className = "Dashboard-Button"> Departments</button></Link>
            
                    <button className = "Dashboard-Button">Expenses</button>
                
                    <button className = "Dashboard-Button">Sales</button>
                
                    <button className = "Dashboard-Button">Payroll</button>

               </div>
            
          </div>
          <div>
          <Switch>
          <Route path={this.props.match.path+"/employees"} component={EmployeeList}/>
          <Route path={this.props.match.path+"/employees/:id"}  component={EditEmployee}/>
          <Route path={this.props.match.path+"/department"} component={DepartmentList}/>
          </Switch>
          
          </div>
          
          </div>
            



           
        );
    }
}

export default Dashboard;