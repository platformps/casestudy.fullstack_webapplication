package com.casestudy.memberservice.repository;

import com.casestudy.memberservice.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    //could have used CRUD repository but JPA repository internally uses both PagingAndSorting Repository and CrudRepository
}
