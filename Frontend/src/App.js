import React from "react";

// New - import the React Router components, and the Profile page component
import { Router, Switch } from "react-router-dom";
import Profile from "./components/Profile";
import Home from './components/Home'
import history from "./utils/history";
import PrivateRoute from "./components/PrivateRoute";
import MenuAppBar from './components/Navigation';
import AlbumHome from "./components/AlbumHome";
import SpringTest from "./components/SpringTest";


function App() {


  return (
    <div className="App">
      {/* Don't forget to include the history module */}
      <Router history={history}>
        <header>
    <MenuAppBar />
        </header>
        <Switch>
          <PrivateRoute path="/" exact component={Home} />
          <PrivateRoute path="/profile" component={Profile} />
          <PrivateRoute path="/albumhome" component={AlbumHome} />
          <PrivateRoute path="/test" component={SpringTest} />
        </Switch>
      </Router>
    </div>
  );
}

export default App;
