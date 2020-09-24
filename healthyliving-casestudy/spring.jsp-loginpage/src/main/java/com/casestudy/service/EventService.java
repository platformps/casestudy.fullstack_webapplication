package com.casestudy.service;

import com.casestudy.model.Event;
import com.casestudy.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    private EventRepository repository;

    @Autowired
    public EventService(EventRepository repository) {

        this.repository = repository;
    }

    public Event create(Event eventToBeCreated) {
        Event persistedEvent = repository.save(eventToBeCreated);
        return persistedEvent;
    }

    public List<Event> readAll() {
        Iterable<Event> eventIterable = repository.findAll();
        List<Event> eventList = new ArrayList<>();
        eventIterable.forEach(eventList::add);
        return eventList;
    }

    public Event readById(Long id) {
        return repository.findById(id).get();
    }

    public Event updateById(Long id, Event updatedData) {
        Event eventInDb = readById(id);
        eventInDb.setLocation(updatedData.getLocation());
        eventInDb.setDescription(updatedData.getDescription());
        eventInDb.setDate(updatedData.getDate());
        eventInDb = repository.save(eventInDb);
        return eventInDb;
    }

    public Event deleteById(Long id) {
        Event eventToBeDeleted = readById(id);
        repository.delete(eventToBeDeleted);
        return eventToBeDeleted;
    }


}



