package com.casestudy.memberservice.controller;

import com.casestudy.memberservice.model.Member;
import com.casestudy.memberservice.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {
     @Autowired
    private MemberRepository repository;

    @GetMapping("/")
    public List<Member> getAll(){
        return repository.findAll();
    }
}
