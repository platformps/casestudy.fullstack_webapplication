package com.casestudy.builder;

import com.casestudy.model.Member;

import java.time.LocalDate;
import java.util.Date;

public class MemberBuilder {
    private Long memberId;
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private Long zip;
    private String email;
    private String phone;
    private LocalDate memberSince;

    public MemberBuilder() {
    }

    public MemberBuilder setMemberId(Long id) {
        this.memberId = id;
        return this;
    }

    public MemberBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public MemberBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public MemberBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Member createMember() {
        return new Member(memberId, firstName, lastName, email);
    }
}
