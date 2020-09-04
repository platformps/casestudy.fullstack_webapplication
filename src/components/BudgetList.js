import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table, ListGroup, ListGroupItem } from 'reactstrap';
import { Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';
import '../viewlist.css';
//import EditBudget from  './EditBudget';


class BudgetList extends Component {

  constructor(props) {
    super(props);
    
    this.state = {budget: [], isLoading: true};
    this.remove = this.remove.bind(this);
  }
  

  componentDidMount() {
    this.setState({isLoading: true});

    fetch('../../api/budget')
      .then(response => response.json())
      .then(data => this.setState({budget: data, isLoading: false}));
      // console.log(budget);
  }

  async remove(id) {
    await fetch(`../../api/budget/${id}`, {
      method: 'DELETE',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    }).then(() => {
      let updatedBudgets = [...this.state.budget].filter(i => i.id !== id);
      this.setState({budget: updatedBudgets});
    });
  }

  render() {
    const {budget, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }
    return (
      <div className = "container  no-gutters mx-auto">
        <div className = "row no-gutters pb-5 pt-5">
          <div className = "col-4">
           
          </div>
          <div className = "col-4">
            <h5>Budgets</h5>
            <hr id="hr2" />
          </div>
          <div className = "col-4">
            <Button className="btn btn-primary" color = "primary" tag={Link} to={this.props.match.path+"/" + budget.id}>+</Button>
          </div>
        </div>
        <div className = "row no-gutters">
          <div className ="col-12 no-gutters pb-5">
             <ul className="list-group">
            {budget.map(budget =>
             <li className="list-group-item" key={budget.id}> 
                {budget.name} {budget.amount}$ {budget.renewDate}
                <Button className="float-right" size="sm" color="primary"   tag={Link} to={this.props.match.path+"/" + budget.id}>Edit</Button>
                <Button className="float-right" size="sm" color="danger" onClick={() => this.remove(budget.id)}>Delete</Button>
              </li>
              
            )}
            </ul>
          </div>
          </div>
          </div>
    );
  }
}

export default BudgetList;