package com.casestudy.service;

import com.casestudy.model.Event;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface EventInterfaceService {

        List<Event> getEventByUser(String user);

        Optional<Event> getEventById(long id);

        void updateEvent(Event event);

        void addEvent(String name, String location, Date targetDate, boolean isDone);

        void deleteEvent(long id);

        void saveEvent(Event event);
    }

