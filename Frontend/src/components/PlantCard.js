import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActionArea from '@material-ui/core/CardActionArea';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
// import { useAuth0 } from "../react-auth0-spa";

const useStyles = makeStyles({
  root: {
    width: 345,
    margin: 10,
  },
  media: {
    height: 200,
  },
});

export default function MediaCard(props) {
  const classes = useStyles();
  // const { loading, user } = useAuth0();
  // if (loading || !user) {
  //   return null;
  // }

  const handleTab = () => {
    props.postView(props.Title, props.albumId, props.albumPosts)
  }

  return (
    <div>
    {/* { user.name === props.Names ? */}
    <Card className={classes.root}>
      <CardActionArea>
        <CardMedia
          className={classes.media}
          image={ props.AlbumImage === undefined ? "https://cmkt-image-prd.freetls.fastly.net/0.1.0/ps/5866340/910/607/m1/fpnw/wm0/hemp5_cm-.jpg?1549906006&s=e717cfea6f6283e4993069047c271c76": props.AlbumImage}
          title="Contemplative Reptile"
        />
        <CardContent>
          <Typography gutterBottom variant="h5" component="h2">
            {props.Title}
          </Typography>
          <Typography variant="body2" color="textSecondary" component="p">
            {props.Description}
          </Typography>
        </CardContent>
      </CardActionArea>
      <CardActions>
      {/* <Link to={"/"+props.Title}> */}
        <Button onClick={handleTab} size="small" color="primary">
          View Album
        </Button>
      {/* </Link> */}
        <Button size="small" color="primary">
          Edit Album
        </Button>
      </CardActions>
    </Card>
    {/* : 
    <div></div>
} */}
</div>

  );
}
