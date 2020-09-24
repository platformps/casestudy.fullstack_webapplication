import React, {Component} from 'react';
import './events.css';

class Events extends Component {
    constructor() {
        super();
        this.state = {
            events:[]
        }
    }

    componentDidMount() { // runs automatically when component is mounted
        fetch('/event/') // fetches events from express server and sets `state`-value to events that were fetched
            .then(res => res.json())
            .then(events => this.setState
            ({events}, () => console.log("Events fetched...", events)))
    }


    render() {
        return (
            <div id="event-list">
                <h3>Events</h3>
                <ul>{ this.state.events.map(event =>
                    <li key={event.id}>
                        { event.name } {event.location}
                    </li>
                )}</ul>
            </div>
        );
    }
}

export default Events;