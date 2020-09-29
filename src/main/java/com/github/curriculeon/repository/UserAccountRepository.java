package com.github.curriculeon.repository;

import com.github.curriculeon.model.UserAccount;
import org.springframework.data.repository.CrudRepository;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {
}
