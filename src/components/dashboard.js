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
import EditDepartment from './EditDepartment';
import  SaleList from  './SaleList';
import  BudgetList from  './BudgetList';
import Avatar from 'react-avatar';
import PrimarySearchAppBar from './PrimarySearchAppBar';
import DashboardGraphs from './DashboardGraphs';
import EditBudget from './EditBudget';


class Dashboard extends Component{
    
     
    constructor(props) {
        super(props);
        let match = props.match
        
    }
    
    render() {
        
        return(
            <div>
                {/* <header className = "Dashboard-Header">  
                <Avatar   src = {userLogo} size="48"  onClick ={() => this.props.history.goBack()}> </Avatar>
              </header> */}
            <div className = "Dashboard-Header">
              <PrimarySearchAppBar/>
              </div>
           
            
          <div className = "menuContainer">
            
             
               <div style = {{textAlign: "left", left: 0}}>


               <Link to = {this.props.match.path}><button className = "Dashboard-Button">Dashboard</button></Link>
                    
                    <Link to = {this.props.match.path+"/employees"}><button className = "Dashboard-Button"> Employees</button></Link>

                    <Link to = {this.props.match.path+"/department"}><button className = "Dashboard-Button"> Departments</button></Link>
            
                    <Link to = {this.props.match.path+"/budget"}><button className = "Dashboard-Button">Budgets</button></Link>
                
                    <Link to = {this.props.match.path+"/sale"}><button className = "Dashboard-Button">Sales</button></Link>
                
                    <button className = "Dashboard-Button">Payroll</button>

               </div>
            
          </div>
          <div>
          <Switch>
          <Route exact path = {this.props.match.path} component = {DashboardGraphs} />
          <Route exact path={this.props.match.path+"/employees"} component={EmployeeList}/>
          <Route path={this.props.match.path+"/employees/:id"}  component={EditEmployee}/>
          <Route exact path={this.props.match.path+"/department"} component={DepartmentList}/>
          <Route path={this.props.match.path+"/department/:id"}  component={EditDepartment}/>
          <Route  exact path={this.props.match.path+"/budget"} component={BudgetList}/>
          <Route path={this.props.match.path+"/budget/:id"}  component={EditBudget}/>
          <Route path={this.props.match.path+"/sale"} component={SaleList}/>
          </Switch>
          </div>
          
          </div>
            



           
        );
    }
}

export default Dashboard;