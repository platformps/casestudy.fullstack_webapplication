package com.casestudy.config;

import com.casestudy.builder.MemberBuilder;
import com.casestudy.builder.MemberBuilder;
import com.casestudy.model.Member;
import com.casestudy.repository.MemberRepository;
import com.casestudy.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;

@Configuration
public class MemberConfig {
    @Autowired
    private MemberRepository repository;

    @PostConstruct
    public void setup() {
        repository.saveAll(Arrays.asList(
                new MemberBuilder()
                        .setFirstName("Leon")
                        .setLastName("Hunter")
                        .setEmail("leonH@gmail.com")
                        .createMember(),

                new MemberBuilder()
                        .setFirstName("Chris")
                        .setLastName("Matthews")
                        .setEmail("chrisM@gmail.com")
                        .createMember(),

                new MemberBuilder()
                        .setFirstName("Haseeb")
                        .setLastName("Muhammed")
                        .setEmail("HaseebMd@gmail.com")
                        .createMember(),

                new MemberBuilder()
                        .setFirstName("Mondira")
                        .setLastName("Roy")
                        .setEmail("MandyRoy@gmail.com")
                        .createMember()));
    }

}
