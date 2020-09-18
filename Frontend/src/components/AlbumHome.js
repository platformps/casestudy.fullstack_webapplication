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
      Posts: props.Posts,
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
        // Posts: selectedPosts
      })
    }

    const allAlbums =  this.state.Albums === null ? <div>nothing</div> :
    this.state.Albums.map(function(Albums)   
    {
      return  <div key={Albums.id}>
              <MediaCard postView={loadPosts} albumId={Albums.id} AlbumImage={Albums.imgurl} Title={Albums.albumtitle} Description={Albums.albumdesc} Names={Albums.name}
              />
              </div> 
    })

    const allPosts =  this.state.Posts === null ? <div>nothing</div> :
    this.state.Posts.map(function(Posts)   
    {
      console.log(Posts)
      return  <div key={Posts.id}>
              <MediaCard albumId={Posts.id} AlbumImage={Posts.postimgurl} Title={Posts.posttitle} Description={Posts.postdesc} Names={Posts.albumname}
              />
              </div> 
    })

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

        {this.state.View === 'post' && <h2 onClick={backButton}><ArrowBackIcon /> Go Back to Albums</h2> }
        <h1 color="primary">{this.state.currentAlbum}</h1>
        <Grid container justify="center" spacing={1} >
        <CustomizedSnackbars />
        { this.state.View ==='album' &&  <FabIntegrationSnackbar /> }
        { this.state.View === 'album' && allAlbums }
        { this.state.View === 'post' && allPosts }
        { this.state.View === 'post' && <AddPost currentAlbum={this.state.currentAlbum} currentId={this.state.currentAlbumId} />}
        
        </Grid>
         </Container>

         </div>
    );
  }
}
