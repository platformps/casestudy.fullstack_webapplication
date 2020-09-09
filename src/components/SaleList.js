import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table, ListGroup, ListGroupItem } from 'reactstrap';
import { Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import '../viewlist.css';
import { withCookies, Cookies } from 'react-cookie';
import { instanceOf } from 'prop-types';
import {withRouter} from 'react-router-dom'
//import EditSale from  './EditSale';


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
    fetch('../api/sale',{credentials: 'include'})
      .then(response => response.json())
      .then(data => this.setState({sale: data, isLoading: false}))
      .catch(() => this.props.history.push('../'));
      // console.log(sale);
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
      <div className = "container  no-gutters mx-auto">
        <div className = "row no-gutters pb-5 pt-5">
          <div className = "col-4">
           
          </div>
          <div className = "col-4">
            <h5>Sales</h5>
            <hr id="hr2" />
          </div>
          <div className = "col-4">
            <Button className="btn btn-primary" color = "primary" tag={Link} to={this.props.match.path+"/" + sale.id}>+</Button>
          </div>
        </div>
        <div className = "row no-gutters">
          <div className ="col-12 no-gutters pb-5">
             <ul className="list-group">
            {sale.map(sale =>
             <li className="list-group-item" key={sale.id}> 
                {sale.productName} {sale.amount}$ {sale.saleDate}
                <Button className="float-right" size="sm" color="primary"   tag={Link} to={this.props.match.path+"/" + sale.id}>Edit</Button>
                <Button className="float-right" size="sm" color="danger" onClick={() => this.remove(sale.id)}>Delete</Button>
              </li>
              
            )}
            </ul>
          </div>
          </div>
          </div>
    );
  }
}

export default withCookies(withRouter(SaleList));