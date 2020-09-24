package com.github.curriculeon.services;

import com.github.curriculeon.models.Event;
import com.github.curriculeon.repositories.EventRepository;
import com.github.curriculeon.utils.Loggable;
import org.springframework.stereotype.Service;


@Service
public class EventService implements Loggable {
    private EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public Iterable<Event> index() {
        getLogger().info("Getting all event objects:");
        Iterable<Event> result = repository.findAll();
        result.forEach(event -> getLogger().info("\t\t" + event.asJsonString()));
        return result;
    }

    public Event show(Long id) {
        return repository.findById(id).get();
    }

    public Event create(Event event) {
        getLogger().info("Creating event:\n\t" + event.asJsonString());
        Event result = repository.save(event);
        getLogger().info("Successfully created event:\n\t" + event.asJsonString());
        return result;
    }

    public Event update(Long id, Event newEventData) {
        Event originalEvent = repository.findById(id).get();
        originalEvent.setName(newEventData.getName());
        originalEvent.setLocation(newEventData.getLocation());

        return repository.save(originalEvent);
    }

    public Boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}
