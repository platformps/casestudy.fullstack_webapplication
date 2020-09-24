package com.casestudy.config;

import com.casestudy.model.Member;
import com.casestudy.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration
public class MemberConfig {
    @Autowired
    private MemberRepository repository;

    @PostConstruct
    public void setup() {
        repository.saveAll(Arrays.asList(
                new Member(),
                new Member(),
                new Member(),
                new Member()));
    }
}
