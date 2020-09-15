import React, { Component } from 'react';
import CustomizedSnackbars from './SimpleSnackbar';
import FabIntegrationSnackbar from './IntegratedSB';
import Container from '@material-ui/core/Container';
import MediaCard from './PlantCard';
import ArrowBackIcon from '@material-ui/icons/ArrowBack';
import Grid from '@material-ui/core/Grid';
import AddPost from './AddPost'


export default class AlbumHome extends Component {
  constructor(props) {
    super(props);
    this.state = 
    {
      Albums: props.Albums,
      View: 'album',
      Posts: null,
      currentAlbum: 'Please Select an Album'
    };
  }

  componentDidUpdate() {
    console.log(this.state.View)
    console.log(this.state.currentAlbumId)
  }


  render() {

    let loadPosts = (selectedAlbum, selectedId, selectedPosts) => {
      this.setState({
        View: 'post',
        currentAlbum: selectedAlbum,
        currentAlbumId: selectedId,
        Posts: selectedPosts
      })
    }

    const allAlbums =  this.state.Albums === null ? <div>nothing</div> :
    this.state.Albums.map(function(Albums)   
    {
      return  <div key={Albums._id}>
              <MediaCard postView={loadPosts} albumPosts={Albums.Posts} albumId={Albums.id} AlbumImage={Albums.imgurl} Title={Albums.albumtitle} Description={Albums.albumdesc} Names={Albums.name}
              />
              </div> 
    })

    const AddNewPost = this.state.Posts === null ? <div>No Posts</div> : <AddPost currentAlbum={this.state.currentAlbum} />

    let backButton = () => {
      this.setState({
        View: 'album',
        currentAlbum: 'Please Select an Album'
      }, () => {console.log(this.state.View)
                console.log(this.state.Albums)
              })
    }

    return (
      <div>
        <Container maxWidth="lg">

        {this.state.View === 'post' ? <h2 onClick={backButton}><ArrowBackIcon /> Go Back to Albums</h2> : null }
        <h1 color="primary">{this.state.currentAlbum}</h1>
        <Grid container justify="center" spacing={1} >
        <CustomizedSnackbars />
        { this.state.View ==='album' ?  <FabIntegrationSnackbar /> : null }
        { this.state.View === 'album' ? allAlbums : null}
        { this.state.View === 'post' ? <AddPost currentPosts={this.state.Posts} currentId={this.state.currentAlbumId} /> : null}
        </Grid>
         </Container>

         </div>
    );
  }
}
