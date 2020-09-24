package com.casestudy.controller;

import com.casestudy.model.Event;
import com.casestudy.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/events")
public class EventController {

    private EventService service;

    @Autowired
    public EventController(EventService service) {
        this.service = service;
    }

    @PostMapping(value = "/")
    public ResponseEntity<Event> create(Event eventToBeCreated) {
        return new ResponseEntity<>(service.create(eventToBeCreated), HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Event> readById(@PathVariable Long id) {
        return new ResponseEntity<>(service.readById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<Event>> readAll() {
        return new ResponseEntity<>(service.readAll(), HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Event> updateById(
            @PathVariable Long id,
            @RequestBody Event newData) {
        return new ResponseEntity<>(service.updateById(id, newData), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Event> deleteById(@PathVariable Long id) {
        return new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);
    }
}

