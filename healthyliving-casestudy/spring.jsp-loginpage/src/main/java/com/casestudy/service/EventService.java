package com.casestudy.service;

import com.casestudy.model.Event;
import com.casestudy.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EventService implements EventInterfaceService {

    @Autowired
    private EventRepository repository;

    @Override
    public List<Event> getEventByUser(String user){
        return repository.findByName(user);
    }

    @Override
    public Optional<Event> getEventById(long id){
        return repository.findById(id);
    }

    @Override
    public void updateEvent(Event Event){
        repository.save(Event);
    }

    @Override
    public void addEvent(String name, String location, Date targetDate, boolean isDone){
        repository.save(new Event(name, location, targetDate, isDone));
    }

    @Override
    public void deleteEvent(long id){
        Optional<Event> Event = repository.findById(id);
        if (Event.isPresent()){
            repository.delete(Event.get());
        }
    }

    @Override
    public void saveEvent(Event Event){
        repository.save(Event);
    }

}



