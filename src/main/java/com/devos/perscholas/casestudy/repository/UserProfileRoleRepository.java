package com.devos.perscholas.casestudy.repository;

import com.devos.perscholas.casestudy.model.UserProfileRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRoleRepository extends JpaRepository<UserProfileRole, Long> {
}
