package com.casestudy.builder;

import com.casestudy.model.Event;

import java.util.Date;

public class EventBuilder {
   
        private Long id;
        private String name;
        private String location;
        private Date targetDate;

        public EventBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public EventBuilder setName(String name) {
            this.name =name;
            return this;
        }

        public EventBuilder setLocation(String location) {
            this.location = location;
            return this;
        }

        public EventBuilder setTargetDate(Date targetDate) {
            this.targetDate = targetDate;
            return this;
        }

        public Event createEvent() {
            return new Event(id, name, location, targetDate);
        }
    }

