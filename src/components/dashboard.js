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
import  ItemList from  './ItemList';
import Avatar from 'react-avatar';
import PrimarySearchAppBar from './PrimarySearchAppBar';
import DashboardGraphs from './DashboardGraphs';
import EditItem from './EditItem';
import EditSale from './EditSale';
import { withCookies } from 'react-cookie';
import PayrollList from './PayrollList';
import EditPayroll from './EditPayroll';
import {withRouter} from 'react-router-dom'
import AuthService from "./auth.service";
import { Icon, Menu, MenuItem } from "@material-ui/core";
import employeeIcon from '../img/employee.png';
import departmentIcon from '../img/department.png';
import inventoryIcon from '../img/inventory.png';
import salesIcon from '../img/sales.png';
import payrollIcon from '../img/payroll.png';
import graphIcon from '../img/graph-bar.png';



class Dashboard extends Component{
    
     
    constructor(props) {
        super();
    }

    async componentDidMount() {
      const user = AuthService.getCurrentUser();
      if (user) {
        this.setState({
          currentUser: user
          
        });
      }
      else{
        this.props.history.push("../");
      }
      }
    
    render() {
        
        return(
            <div className = "parent" >
                {/* <header className = "Dashboard-Header">  
                <Avatar   src = {userLogo} size="48"  onClick ={() => this.props.history.goBack()}> </Avatar>
              </header> */}
            <div className = "Dashboard-Header column">
              <PrimarySearchAppBar  value = {this.props}/>
              <div className = "menuContainer">
                <div>
                <div className = "icons">
                <div><Link to = {this.props.match.path}><img src = {graphIcon} className = "menuButton"></img></Link></div>
                  <div><Link to = {this.props.match.path +"/employees"}><img src = {employeeIcon} className = "menuButton"></img></Link></div>
                  <div><Link to = {this.props.match.path +"/departments"}><img src = {departmentIcon} className = "menuButton"></img></Link></div>
                  <div><Link to = {this.props.match.path +"/item"}><img src = {inventoryIcon} className = "menuButton"></img></Link></div>
                  <div><Link to = {this.props.match.path +"/sale"}><img src = {salesIcon} className = "menuButton"></img></Link></div>
                  <div><Link to = {this.props.match.path +"/payroll"}><img src = {payrollIcon} className = "menuButton"></img></Link></div>
                </div>
                </div>
            
              </div>
                
              </div>

          

           
          <div style= {{paddingTop: "10%"}} className = "mainContent column">
           <Switch>
           <Route exact path={this.props.match.path}  component={DashboardGraphs}/>
           <Route exact path={this.props.match.path +"/employees" }  component={EmployeeList}/>
           <Route path={this.props.match.path+"/employees/:id"}  component={EditEmployee}/>
           <Route exact path={this.props.match.path +"/departments"}  component={DepartmentList}/>
           <Route path={this.props.match.path+"/departments/:id"}  component={EditDepartment}/>
           <Route exact path={this.props.match.path+"/item"}  component={ItemList}/>
           <Route path={this.props.match.path+"/item/:id"}  component={EditItem}/>  
           <Route  exact path={this.props.match.path + "/sale"}  component={SaleList}/>
           <Route path={this.props.match.path+"/sale/:id"}  component={EditSale}/>
           <Route exact path={this.props.match.path + "/payroll"}  component={PayrollList}/>
           <Route path={this.props.match.path+"/payroll/:id"}  component={EditPayroll}/>
           </Switch>
           </div>
           </div>
           
        );
    }
}

export default withRouter(Dashboard);