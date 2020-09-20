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
import Menu from '@material-ui/core/Menu';
import {withRouter} from 'react-router-dom'
import AuthService from "./auth.service";




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
      }
    
    render() {
        
        return(
            <div className = "parent" >
                {/* <header className = "Dashboard-Header">  
                <Avatar   src = {userLogo} size="48"  onClick ={() => this.props.history.goBack()}> </Avatar>
              </header> */}
            <div className = "Dashboard-Header column">
              <PrimarySearchAppBar  value = {this.props} />
              
              </div>
           
          <div style= {{paddingTop: "10%"}} className = "mainContent column">
           <DashboardGraphs/>
           <div>
           <br></br><br></br>
           <Switch>
           <Route exact path={this.props.match.path }  component={EmployeeList}/>
           <Route path={this.props.match.path+"/employees/:id"}  component={EditEmployee}/>
           </Switch>
           <br></br><br></br>
           <Switch>
           <Route exact path={this.props.match.path}  component={DepartmentList}/>
           <Route path={this.props.match.path+"/departments/:id"}  component={EditDepartment}/>
           </Switch>
           
           <br></br><br></br>
           <Switch>
           <Route exact path={this.props.match.path}  component={ItemList}/>
           <Route path={this.props.match.path+"/item/:id"}  component={EditItem}/>
           </Switch>
           
           <br></br><br></br>
           <Switch>
           <Route  exact path={this.props.match.path}  component={SaleList}/>
           <Route path={this.props.match.path+"/sale/:id"}  component={EditSale}/>
           </Switch>
           
           <br></br><br></br>
           <Switch>
           <Route exact path={this.props.match.path}  component={PayrollList}/>
           <Route path={this.props.match.path+"/payroll/:id"}  component={EditPayroll}/>
           </Switch>
           
           <br></br><br></br>
           </div>
           </div>
          </div>
           
        );
    }
}

export default withRouter(Dashboard);