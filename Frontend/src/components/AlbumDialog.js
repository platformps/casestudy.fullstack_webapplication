import React from 'react';
import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import Dialog from '@material-ui/core/Dialog';
import DialogActions from '@material-ui/core/DialogActions';
import DialogContent from '@material-ui/core/DialogContent';
import DialogContentText from '@material-ui/core/DialogContentText';
import DialogTitle from '@material-ui/core/DialogTitle';

export default function AlbumDialog(props) {
  const [open, setOpen] = React.useState(false);

  const handleClickOpen = () => {
    setOpen(true);
  };

  const handleClose = () => {
    setOpen(false);
  };

  const deleteAlbum = () => {
      console.log("Deleted album " + props.albumId)
      const requestOptions = {
        method: 'DELETE',
        headers: { 'Content-Type': 'application/json' }
    };
    fetch('http://localhost:8080/albums/' + props.albumId, requestOptions)
    .then(async response => {
        const data = await response.json();
        console.log(data)
        setOpen(false);
        props.updateAlbums(data);
        
        // check for error response
        if (!response.ok) {
            // get error message from body or default to response status
            const error = (data && data.message) || response.status;
            return Promise.reject(error);    
        }
    })
    .catch(error => {
        
        console.error('There was an error!', error);
        setOpen(false);
    });
  }

  return (
    <div>
      <Button color="primary" onClick={handleClickOpen}>
        Edit Album
      </Button>
      <Dialog open={open} onClose={handleClose} aria-labelledby="form-dialog-title">
        <DialogTitle id="form-dialog-title">Edit Album</DialogTitle>
        <DialogContent>
          <DialogContentText>
            To Edit Album Change Fields Below
            {props.albumTitle}
          </DialogContentText>
          <TextField
            autoFocus
            margin="dense"
            id="albumTitle"
            label="Album Title"
            type="text"
            fullWidth
          />
        <TextField
            autoFocus
            margin="dense"
            id="albumDesc"
            label="Album Description"
            type="email"
            fullWidth
          />
        <TextField
            autoFocus
            margin="dense"
            id="albumUrl"
            label="Album Cover Image url"
            type="text"
            fullWidth
          />
        <Button color="primary" onClick={deleteAlbum}>
            Delete Album 
            </Button>
        </DialogContent>
        <DialogActions>
          <Button onClick={handleClose} color="primary">
            Cancel
          </Button>
          <Button onClick={handleClose} color="primary">
            Subscribe
          </Button>
        </DialogActions>
      </Dialog>
    </div>
  );
}