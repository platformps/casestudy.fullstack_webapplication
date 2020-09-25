import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table, ListGroup, ListGroupItem } from 'reactstrap';
import { Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import '../viewlist.css';
import { instanceOf } from 'prop-types';
import authHeader from './auth-header';

class SaleList extends Component {

  constructor(props) {
    super();
    this.state = {sale: [], isLoading: true};
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
        'Authorization':authHeader(),
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
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
                 <Button className="float-right" size="sm" color="primary"   tag={Link} to={this.props.match.path+"/" + sale.id}>Edit</Button>
                 <Button className="float-right" size="sm" color="danger" onClick={() => this.remove(sale.id)}>Delete</Button>
                </ButtonGroup>
                </td>
              </tr>
            )}
      </tbody>
    </Table>
    <Button className="btn btn-primary" color = "primary" tag={Link} to={this.props.match.path+"/new"}>Add Sale</Button>
    </div>
    );
  }
}

export default SaleList;