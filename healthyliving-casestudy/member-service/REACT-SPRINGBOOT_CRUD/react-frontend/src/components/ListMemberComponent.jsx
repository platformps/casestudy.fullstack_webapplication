import React, { Component } from 'react';
import MemberService from '../services/MemberService';

class ListMemberComponent extends Component {
    constructor(props){
        super(props)

        this.state = {
           members: []
        }
        this.addMember= this.addMember.bind(this);
        this.editMember=this.editMember.bind(this);
        this.deleteMember=this.deleteMember.bind(this);
    }
     deleteMember(id){
    MemberService.deleteMember(id).then(res => {
     this.setState({members:this.state.members
    .filter(member =>member.id !== id)});
     });
     }

    editMember(id){
      this.props.history.push('/update-member/${id}');
    }

    componentDidMount(){
     MemberService.getMembers().then((res) => {
    this.setState({members: res.data});
});
    }
    addMember(){
        this.props.history.push('/add-member');
    }

    render() {
        return (
            <div>
             <h2 className ="text-center"> Member List </h2>  
                <div className= "row" >
                  <button className="btn btn-primary" onClick={this.addMember}>Add Member</button>  
                </div> 
            <div className = "row" >
                <table className = "table table-striped table-bordered">
                    <thead>
                        <tr>
                            <th> Member First Name</th>
                            <th> Member Last Name</th>
                            <th> Member Email Id</th>
                            <th> Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.members.map(
                                member =>
                                <tr key = { member.memberId}>
                                    <td> { member.firstName }</td>
                                    <td> { member.lastName } </td>
                                    <td> { member.email }   </td>
                                    <td>
                                       <button onClick ={ () => this.editMember(member.id)} className="btn btn-info">Update</button>
                                       <button style={{marginLeft:"10px"}} onClick = { () => this.deleteMember(member.id)} className="btn btn-danger">Delete</button>
                                    </td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
            </div>
        );
    }
}

export default ListMemberComponent;