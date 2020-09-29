import React from 'react';
import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router,Route,Switch} from 'react-router-dom';
import ListMemberComponent from './components/ListMemberComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import CreateMemberComponent from './components/CreateMemberComponent';
import UpdateMemberComponent from './components/UpdateMemberComponent';
import ViewMemberComponent from './components/ViewMemberComponent';

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
              <Route path="/view-member/:id" component={ViewMemberComponent}></Route>
              
            </Switch>
          </div>
           <FooterComponent />
        
      </Router>
    </div>
  );
}

export default App;
