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
import EditSale from './EditSale';
import { withCookies } from 'react-cookie';
import PayrollList from './PayrollList';
import EditPayroll from './EditPayroll';


class Dashboard extends Component{

    state = {
        isLoading: true,
        isAuthenticated: false,
        user: undefined
      };
    
    
     
    constructor(props) {
        super(props);
        let match = props.match
        const {cookies} = props;
        this.state.csrfToken = cookies.get('XSRF-TOKEN');
        this.logout = this.logout.bind(this);
        this.wrapper = React.createRef();
        
    }

    async componentDidMount() {
        const response = await fetch('/api/user', {credentials: 'include'});
        const body = await response.text();
        if (body === '') {
          this.setState(({isAuthenticated: false}))
        } else {
          this.setState({isAuthenticated: true, user: JSON.parse(body)})
        }
      }

      logout() {
        fetch('/api/logout', {method: 'POST', credentials: 'include',
          headers: {'X-XSRF-TOKEN': this.state.csrfToken}}).then(res => res.json())
          .then(response => {
            window.location.href = response.logoutUrl + "?id_token_hint=" +
              response.idToken + "&post_logout_redirect_uri=" + window.location.origin;
          });
      }
    
    render() {
        
        return(
            <div>
                {/* <header className = "Dashboard-Header">  
                <Avatar   src = {userLogo} size="48"  onClick ={() => this.props.history.goBack()}> </Avatar>
              </header> */}
            <div className = "Dashboard-Header" ref={this.wrapper}>
              <PrimarySearchAppBar  />
              </div>
           
            
          <div className = "menuContainer">
            
             
               <div style = {{textAlign: "left", left: 0}}>

<Button onClick = {this.logout}>  logout</Button>
               <Link to = {this.props.match.path}><button className = "Dashboard-Button">Dashboard</button></Link>
                    
                    <Link to = {this.props.match.path+"/employees"}><button className = "Dashboard-Button"> Employees</button></Link>

                    <Link to = {this.props.match.path+"/department"}><button className = "Dashboard-Button"> Departments</button></Link>
            
                    <Link to = {this.props.match.path+"/budget"}><button className = "Dashboard-Button">Budgets</button></Link>
                
                    <Link to = {this.props.match.path+"/sale"}><button className = "Dashboard-Button">Sales</button></Link>
                
                    <Link to = {this.props.match.path+"/payroll"}><button className = "Dashboard-Button">Payroll</button></Link>

               </div>
            
          </div>
          
          <Switch>
          <Route exact path = {this.props.match.path} component = {DashboardGraphs} />
          <Route exact path={this.props.match.path+"/employees"} component={EmployeeList}/>
          <Route path={this.props.match.path+"/employees/:id"}  component={EditEmployee}/>
          <Route exact path={this.props.match.path+"/department"} component={DepartmentList}/>
          <Route path={this.props.match.path+"/department/:id"}  component={EditDepartment}/>
          <Route  exact path={this.props.match.path+"/budget"} component={BudgetList}/>
          <Route path={this.props.match.path+"/budget/:id"}  component={EditBudget}/>
          <Route exact path={this.props.match.path+"/sale"} component={SaleList}/>
          <Route path={this.props.match.path+"/sale/:id"}  component={EditSale}/>
          <Route exact path={this.props.match.path+"/payroll"} component={PayrollList}/>
          <Route path={this.props.match.path+"/payroll/:id"}  component={EditPayroll}/>
          </Switch>
          
          
          </div>
            



           
        );
    }
}

export default withCookies(Dashboard);