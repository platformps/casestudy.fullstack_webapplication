import React, { Component } from 'react';
import PropTypes from 'prop-types';

class ViewMemberComponent extends Component {
    constructor(props) {
        super(props);

    }

        componentDidMount() {

    }
    
    render() {
        return (
            <div>
              <div className = "container">
                 <div className = "row">
                    <div className = "card col-md-6 offset-md-3 offset-md-3">
                        <h3 className ="text-center">Delete Member</h3>
                        <div className ="card-body">
                            <form>
                                <div className = "form-group">
                                    <label>First Name:</label>
                                    <input placeholder="First Name" name="firstName" className="form-control"
                                    value={this.state.firstName} onChange={this.changeFirstNameHandler}/>
                                </div>
                                <div className = "form-group">
                                    <label>Last Name:</label>
                                    <input placeholder="Last Name" name="lastName" className="form-control"
                                    value={this.state.lastName} onChange={this.changeLastNameHandler}/>
                                </div>
                                <div className = "form-group">
                                    <label>Email Address:</label>
                                    <input placeholder="Email Address" name="email" className="form-control"
                                    value={this.state.email} onChange={this.changeEmailHandler}/>
                                </div>
                                <button className="btn btn-success" onClick={this.saveMember}>Delete</button>
                                <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft:"10px"}}>
                                Cancel</button>
                            </form>
                        </div>
                    </div>
                     </div>
                     
                     </div>  
            </div>
        );
    }
}

export default ViewMemberComponent;