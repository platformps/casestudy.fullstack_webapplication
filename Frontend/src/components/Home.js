import React, { Component } from 'react';
import AlbumHome from './AlbumHome';

export default class Home extends Component {
  constructor(props) {
    super(props);
    this.state = 
    {
      Albums: null,
    };
  }
  

    componentDidMount() {
            fetch("http://localhost:8080/albums")
            .then(res => res.json())
            .then(
              (result) => {
                  this.setState({
                    Albums: result
                  })
              },
              // Note: it's important to handle errors here
              // instead of a catch() block so that we don't swallow
              // exceptions from actual bugs in components.
              (error) => {
                  return error
              }
            )
      }



  render() {
    return (
      <div>
        {
        this.state.Albums == null ? 
        <div>You Have No Albums! Lets get started</div>
        :
        <AlbumHome Albums={this.state.Albums} />
        }
         </div>
    );
  }
}
