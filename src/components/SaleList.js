import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table, ListGroup, ListGroupItem } from 'reactstrap';
import { Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import '../viewlist.css';
import { withCookies, Cookies } from 'react-cookie';
import { instanceOf } from 'prop-types';
import {withRouter} from 'react-router-dom'
import authHeader from './auth-header';
import AuthService from "./auth.service";

class SaleList extends Component {

  static propTypes = {
    cookies: instanceOf(Cookies).isRequired
  };

  constructor(props) {
    super(props);
    const {cookies} = props;
    this.state = {sale: [],csrfToken: cookies.get('XSRF-TOKEN') , isLoading: true};
    this.remove = this.remove.bind(this);
  }
  

  componentDidMount() {
    this.setState({isLoading: true});
    fetch('../api/sale',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({sale: data, isLoading: false}))
  }

  async remove(id) {
    await fetch(`../api/sale/${id}`, {
      method: 'DELETE',
      headers: {
        'X-XSRF-TOKEN': this.state.csrfToken,
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      credentials: 'include'
    }).then(() => {
      let updatedSales = [...this.state.sale].filter(i => i.id !== id);
      this.setState({sale: updatedSales});
    });
  }

  render() {
    const {sale, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }
    return (
      <div >
      <div >
            <h2>Sales</h2>
            <hr id="hr2" />
          </div>
      <Table className = "container  ">
      <thead>
        <tr>
          <th>Amount</th>
          <th>Sale Date</th>
          <th>Employee</th>
          <th>Department</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
      {sale.map(sale =>
             <tr key={sale.id}> 
               <td>${sale.amount}</td>  
               <td>{sale.saleDate}</td> 
               <td>{sale.employee.firstName + ' ' + sale.employee.lastName}</td> 
               <td>{sale.department.name}</td> 
               <td>
                 <ButtonGroup>
                 <Button className="float-right" size="sm" color="primary"   tag={Link} to={this.props.match.path+"/sale/" + sale.id}>Edit</Button>
                 <Button className="float-right" size="sm" color="danger" onClick={() => this.remove(sale.id)}>Delete</Button>
                </ButtonGroup>
                </td>
              </tr>
            )}
      </tbody>
    </Table>
    <Button className="btn btn-primary" color = "primary" tag={Link} to={this.props.match.path+"/sale/new"}>Add Sale</Button>
    </div>
    );
  }
}

export default withCookies(withRouter(SaleList));