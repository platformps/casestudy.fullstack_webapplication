import React, { Component } from 'react';
import { Button, ButtonGroup, Table} from 'reactstrap';
import { Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import '../viewlist.css';
import { withCookies} from 'react-cookie';
import {withRouter} from 'react-router-dom'
import authHeader from './auth-header';

class ItemList extends Component {
  


  constructor(props) {
    super();
    this.state = {items: [],isLoading: true};
    this.remove = this.remove.bind(this);

  }
  

  componentDidMount() {
    this.setState({isLoading: true});
    fetch('../api/item',{headers: authHeader()})
      .then(response => response.json())
      .then(data => this.setState({item: data, isLoading: false}))
  }

  async remove(id) {
    await fetch(`../api/item/${id}`, {
      method: 'DELETE',
      headers: {
        'Authorization':authHeader(),
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
    }).then(() => {
      let updatedItems = [...this.state.item].filter(i => i.id !== id);
      this.setState({item: updatedItems});
    });
  }

  render() {
    const {item, isLoading} = this.state;
    if (isLoading) {
      return <p>Loading...</p>;
    }
    return (
      <div  >
      <div >
            <h2>Inventory</h2>
            <hr id="hr2" />
          </div>
      <Table className = "container  ">
      <thead>
        <tr>
          <th>Product Name</th>
          <th>Price</th>
          <th>Quantity</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
      {item.map(item =>
             <tr key={item.id}> 
               <td>{item.name}</td> 
               <td>{item.price}</td>  
               <td>{item.quantity}</td> 
               <td>
                 <ButtonGroup>
                 <Button className="float-right" size="sm" color="primary"   tag={Link} to={this.props.match.path+"/item/" + item.id}>Edit</Button>
                 <Button className="float-right" size="sm" color="danger" onClick={() => this.remove(item.id)}>Delete</Button>
                </ButtonGroup>
                </td>
              </tr>
            )}
      </tbody>
    </Table>
    <Button className="btn btn-primary" color = "primary" tag={Link} to={this.props.match.path+"/item/new"}>Add Item</Button>
    </div>
    );
  }
}

export default withCookies(withRouter(ItemList));