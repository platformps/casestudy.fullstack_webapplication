import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table } from 'reactstrap';
import { Link } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';

class EmployeeList extends Component {

  constructor(props) {
    super(props);
    this.state = {employee: [], isLoading: true};
    this.remove = this.remove.bind(this);
  }

  componentDidMount() {
    this.setState({isLoading: true});

    fetch('api/employee')
      .then(response => response.json())
      .then(data => this.setState({employee: data, isLoading: false}));
  }

  async remove(id) {
    await fetch(`/api/employee/${id}`, {
      method: 'DELETE',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    }).then(() => {
      let updatedEmployees = [...this.state.employee].filter(i => i.id !== id);
      this.setState({employee: updatedEmployees});
    });
  }

  render() {
    const {employee, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }
    return (
     
          <div className="App-intro">
            <h2>Employee List</h2>
            {employee.map(employee =>
              <div key={employee.id}>
                <td>
                <ButtonGroup>
                {employee.firstName} {employee.lastName }
                <Button size="sm" color="primary" tag={Link} to={"/employee/" + employee.id}>Edit</Button>
                <Button size="sm" color="danger" onClick={() => this.remove(employee.id)}>Delete</Button>
                </ButtonGroup>
                </td>
              </div>
            )}
          </div>
    );
  }
}

export default EmployeeList;