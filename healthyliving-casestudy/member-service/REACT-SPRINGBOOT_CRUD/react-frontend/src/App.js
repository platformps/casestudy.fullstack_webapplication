import React from 'react';
import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router,Route,Switch} from 'react-router-dom';
import ListMemberComponent from './components/ListMemberComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';

function App() {
  return (
    <div>
      <Router>
        
          <HeaderComponent />
         <div className="container">
            <Switch>
              <Route path="/" exact component={ListMemberComponent}></Route>
              <Route path="/members" component={ListMemberComponent}></Route>
              <Route path="/add-member" component={CreateMemberComponent}></Route>
              <Route path="/update-member/:id" component={UpdateMemberComponent}></Route>
              
            </Switch>
          </div>
           <FooterComponent />
        
      </Router>
    </div>
  );
}

export default App;
