package com.github.perscholas.repositories;

import com.github.perscholas.models.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserAccount, Long> {
    UserAccount findByUsername(String username);
}
