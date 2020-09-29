package com.casestudy.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String location;
    private String name;
    private Date targetDate;


        public Event(){
            super();
        }



    public Long getId() {
            return id;
        }

    public Event(Long id, String location, String name, Date targetDate) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.targetDate = targetDate;
    }

    public void setId(Long id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getlocation() {
            return location;
        }
        public void setlocation(String location) {
            this.location = location;
        }
        public Date getTargetDate() {
            return targetDate;
        }
        public void setTargetDate(Date targetDate) {
            this.targetDate = targetDate;
        }
    }
