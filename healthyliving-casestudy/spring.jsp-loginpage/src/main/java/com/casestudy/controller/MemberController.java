package com.casestudy.controller;

import com.casestudy.model.Member;
import com.casestudy.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class MemberController {
    @Autowired
    private MemberRepository repository;

    @GetMapping("/members")
    public List<Member> getAll() {
        return repository.findAll();
    }

    //    //create Member rest Api
    @PostMapping("/members")
    public Member createMember(Member member) {
        return repository.save(member);
    }
}