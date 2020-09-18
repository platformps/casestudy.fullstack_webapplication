import React, { Component } from 'react';
import AlbumHome from './AlbumHome';

export default class Home extends Component {
  constructor(props) {
    super(props);
    this.state = 
    {
      Albums: null,
      Posts: null
    };
  }
  

    componentDidMount() {
            // fetch("http://localhost:8080/albums")
            // .then(res => res.json())
            // .then(
            //   (result) => {
            //       this.setState({
            //         Albums: result
            //       })
            //   },
            //   (error) => {
            //       return error
            //   }
            // )

            Promise.all([
              fetch('http://localhost:8080/albums'),
              fetch('http://localhost:8080/posts')
            ]).then(function (responses) {
              // Get a JSON object from each of the responses
              return Promise.all(responses.map(function (response) {
                return response.json();
              }));
            }).then((data) => {
              // Log the data to the console
              // You would do something with both sets of data here
              console.log(data[0]);
              this.setState({
                Albums: data[0],
                Posts: data[1]
              })
            }).catch(function (error) {
              // if there's an error, log it
              console.log(error);
            });
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
        <AlbumHome Albums={this.state.Albums} Posts={this.state.Posts} passedFunction={this.updateAlbums} />
        }
         </div>
    );
  }
}
