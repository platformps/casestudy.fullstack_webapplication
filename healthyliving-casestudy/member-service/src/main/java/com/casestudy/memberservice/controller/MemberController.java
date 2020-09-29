package com.casestudy.memberservice.controller;

import com.casestudy.memberservice.exception.ResourceNotFoundException;
import com.casestudy.memberservice.model.Member;
import com.casestudy.memberservice.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/")
public class MemberController {
     @Autowired
    private MemberRepository repository;

//get ALL members
    @GetMapping("/members")
    public List<Member> getAllMembers(){
        return repository.findAll();
    }
    //create Member rest Api
    @PostMapping("/members")
    public Member createMember(@RequestBody Member member){
        return repository.save(member);
    }
    //get member by ID
    @GetMapping("/members/{id")
    public ResponseEntity<Member> getMemberById(@PathVariable Long id){
        Member member = repository.findById(id)
                .orElseThrow(() ->new ResourceNotFoundException("Member does not exist with id:" + id));
        return ResponseEntity.ok(member);
    }
    //Update member rest api
    @PutMapping("/members/{id}")
    public ResponseEntity<Member> updateMember(@PathVariable Long id, Member memberDetails){
        Member member = repository.findById(id)
                .orElseThrow(() ->new ResourceNotFoundException("Member does not exist with id:" + id));
        member.setFirstName(memberDetails.getFirstName());
        member.setLastName(memberDetails.getLastName());
        member.setEmail(memberDetails.getEmail());

        Member updatedMember = repository.save(member);
        return ResponseEntity.ok(updatedMember);
    }
        //Delete member by ID
        @DeleteMapping("/members/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteMember(@PathVariable Long id){
        Member member = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Member with this id does not exist :" + id));
        repository.delete(member);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Member deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
