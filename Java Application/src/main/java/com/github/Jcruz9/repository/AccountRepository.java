package com.github.Jcruz9.repository;

import com.github.Jcruz9.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    Account findByEmail(String email);
}
