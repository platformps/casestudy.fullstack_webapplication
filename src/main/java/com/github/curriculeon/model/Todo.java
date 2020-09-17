package com.github.curriculeon.model;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "todo_list")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String userName;

    @Size(min = 10, message = "Enter at least 10 Characters...")
    private String description;

    private Date targetDate;

    public Todo(){
        super();
    }

    public Todo(String userName,String description, Date targetDate, boolean isDone) {
        super();
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
}
