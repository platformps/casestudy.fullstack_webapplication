import React, {Component} from 'react';
import './event-form.css';

class EventForm extends Component {
    componentDidMount() { // runs automatically when component is mounted        
    }

    constructor() {
        super();
        this.state = {
          name: '',
          location: ''

        };
      }

    onChange = (e) => {
        /*
          Because we named the inputs to match their
          corresponding values in state, it's
          super easy to update the state
        */
        this.setState({ [e.target.name]: e.target.value });
    }

      
    onSubmit = (e) => {
        e.preventDefault();
        // get our form data out of state
        const { name, location } = this.state;
        const request = {
            method: 'POST',
            body: JSON.stringify({
                "name": name,
                "location": location

            }),
            headers: {"Content-Type": "application/json"}
        };
        fetch("event/", request)
            .then((res) => res.json())
            .then((body)=> {
              alert(JSON.stringify(body));
              window.location.reload(false);
            });
    }

      render() {
        const { name, location } = this.state;
        return (
          <form>
            <label id="name-label">Name:</label>
            <input
              type="text"
              name="name"
              value={name}
              onChange={this.onChange}
            /><br />
            <label id="location-label">Location:</label>
            <input
              type="text"
              name="location"
              value={location}
              onChange={this.onChange}
            /><br />

            <button type="Select" onClick={this.onSubmit}>Submit</button>

          </form>
        );
      }
}

export default EventForm;