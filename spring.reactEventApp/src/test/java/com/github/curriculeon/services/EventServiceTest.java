package com.github.curriculeon.services;


import com.github.curriculeon.MainApplication;

import com.github.curriculeon.controllers.EventController;
import com.github.curriculeon.models.Event;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MainApplication.class)
public class EventServiceTest {
    @MockBean
    private EventService service;

    private EventController controller;

    @Before
    public void setup(){
        this.controller = new EventController(service);
    }


    @Test
    public void testCreate() {
        // Given
        HttpStatus expected = HttpStatus.CREATED;
        Event expectedEvent = new Event();
        BDDMockito
                .given(service.create(expectedEvent))
                .willReturn(expectedEvent);

        // When
        ResponseEntity<Event> response = controller.create(expectedEvent);
        HttpStatus actual = response.getStatusCode();
        Event actualEvent = response.getBody();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedEvent, actualEvent);
    }


    @Test
    public void testShow() {
        // Given
        Long expectedId = 1L;
        HttpStatus expected = HttpStatus.OK;
        Event expectedEvent = new Event();
        expectedEvent.setId(expectedId);
        BDDMockito.
                given(service.show(1L))
                .willReturn(expectedEvent);

        // When
        ResponseEntity<Event> response = controller.show(expectedId);
        HttpStatus actual = response.getStatusCode();
        Event actualEvent = response.getBody();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedEvent, actualEvent);
    }

}
