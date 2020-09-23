package com.devos.perscholas.casestudy.repository;

import com.devos.perscholas.casestudy.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    UserProfile findByUsername(String username);
}
