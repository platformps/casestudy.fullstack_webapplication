package com.casestudy.config;

import com.casestudy.builder.EventBuilder;
import com.casestudy.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;


    @Configuration
    public class EventConfig {
        @Autowired
        private EventRepository repository;

        @PostConstruct
        public void setup() {
            repository.saveAll(Arrays.asList(
                    new EventBuilder()

                            .setName("Zumba with Zombies")
                            .setLocation("Zambia")
                            .setTargetDate(new Date())
                            .createEvent(),

                    new EventBuilder()
                            .setTargetDate(new Date())
                            .setLocation("Minneapolis")
                            .setName("Meditation for mental peace")
                            .createEvent(),

                    new EventBuilder()
                            .setTargetDate(new Date())
                            .setLocation("Alamao")
                            .setName("All about Yoga for healing")
                            .createEvent(),

                    new EventBuilder()
                            .setTargetDate(new Date())
                            .setLocation("Long beach")
                            .setName("Eating healthy for Longevity")
                            .createEvent(),

                    new EventBuilder()
                            .setTargetDate(new Date())
                            .setLocation("San Francisco")
                            .setName("Surya Namaskar for the soul")
                            .createEvent(),

                    new EventBuilder()
                            .setTargetDate(new Date())
                            .setLocation("France")
                            .setName("Cycling for fun and frolick")
                            .createEvent()));
        }

    }


