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
              (error) => {
                  return error
              }
            )
      }

      updateAlbums = () => {
        this.componentDidMount();
      }



  render() {
    return (
      <div>
        {
        this.state.Albums == null ? 
        <div>You Have No Albums! Lets get started</div>
        :
        <AlbumHome Albums={this.state.Albums} passedFunction={this.updateAlbums} />
        }
         </div>
    );
  }
}
