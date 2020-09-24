package com.github.curriculeon.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.curriculeon.models.Event;
import com.github.curriculeon.repositories.EventRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;


/**
 * @author leon on 8/30/18.
 */
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class EventControllerTest {

    @Autowired
    private MockMvc mvc;


    @MockBean
    private EventRepository repository;

    @Test
    public void testShow() throws Exception {
        Long givenId = 1L;
        Event event = new Event();
        BDDMockito
                .given(repository.findById(givenId))
                .willReturn(Optional.of(event));
        String expectedContent = new ObjectMapper().writeValueAsString(event);
        this.mvc.perform(MockMvcRequestBuilders
                .get("/events/" + givenId))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedContent));
    }

    @Test
    public void testCreate() throws Exception {
        Event event = new Event();
        BDDMockito
                .given(repository.save(event))
                .willReturn(event);

        String expectedContent = new ObjectMapper().writeValueAsString(event);
        this.mvc.perform(MockMvcRequestBuilders
                .post("/events/")
                .content(expectedContent)
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
            )
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().string(expectedContent));
    }
}
