import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table, ListGroup, ListGroupItem } from 'reactstrap';
import { Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import '../viewlist.css';
import EditPayroll from  './EditPayroll';
import { withCookies, Cookies } from 'react-cookie';
import { instanceOf } from 'prop-types';
import {withRouter} from 'react-router-dom'
import authHeader from './auth-header';
import AuthService from "./auth.service";

class PayrollList extends Component {
  

  constructor(props) {
    super(props);
    this.state = {payroll: [],isLoading: true};
    this.remove = this.remove.bind(this);

  }
  

  componentDidMount() {
    this.setState({isLoading: true});
    fetch('../api/payroll',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({payroll: data, isLoading: false}))
     
  }

  async remove(id) {
    await fetch(`../api/payroll/${id}`, {
      method: 'DELETE',
      headers: {
        'Authorization':authHeader(),
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
    }).then(() => {
      let updatedPayrolls = [...this.state.payroll].filter(i => i.id !== id);
      this.setState({payroll: updatedPayrolls});
    });
  }

  render() {
    const {payroll, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }
    return (
      <div >
      <div >
            <h2>Payroll</h2>
            <hr id="hr2" />
          </div>
      <Table className = "container ">
      <thead>
        <tr>
          <th>Employee</th>
          <th>Amount</th>
          <th>Date</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
      {payroll.map(payroll =>
             <tr key={payroll.id}> 
               <td>{payroll.employee.firstName + ' ' + payroll.employee.lastName} </td>  
               <td>${payroll.amount}</td>  
               <td>{payroll.payDate}</td> 
               <td>
                 <ButtonGroup>
                 <Button className="float-right" size="sm" color="primary"   tag={Link} to={this.props.match.path+"/" + payroll.id}>Edit</Button>
                 <Button className="float-right" size="sm" color="danger" onClick={() => this.remove(payroll.id)}>Delete</Button>
                </ButtonGroup>
                </td>
              </tr>
            )}
      </tbody>
    </Table>
    <Button className="btn btn-primary" color = "primary" tag={Link} to={this.props.match.path+"/new"}>Add Payroll</Button>
    </div>
    );
  }
}

export default withCookies(withRouter(PayrollList));