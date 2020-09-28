package com.casestudy.memberservice.model;

import javax.persistence.*;

@Entity
@Table(name ="members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(name="first-name")
    private String firstName;

    @Column(name="last-name")
    private String lastName;

    @Column(name="email")
    private  String email;

    public Member() {
    }

    public Member( String firstName, String lastName, String emil) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = emil;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long id) {
        this.memberId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmil() {
        return email;
    }

    public void setEmil(String emil) {
        this.email = email;
    }
}
