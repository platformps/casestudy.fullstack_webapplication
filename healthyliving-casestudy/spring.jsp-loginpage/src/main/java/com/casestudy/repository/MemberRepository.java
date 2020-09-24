package com.casestudy.repository;

import com.casestudy.model.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
}


