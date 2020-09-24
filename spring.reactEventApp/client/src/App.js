import React, {Component} from 'react';
import './App.css';
import Events from './components/events/events';
import EventForm from './components/event-form/event-form';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <a href="http://localhost:8080/h2-console/">View Database</a>
          <EventForm/>
          <Events/>
        </header>
      </div>
    );
  }
}
export default App;
