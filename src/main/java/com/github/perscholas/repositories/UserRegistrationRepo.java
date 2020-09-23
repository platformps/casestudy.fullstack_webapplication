package com.github.perscholas.repositories;

import com.github.perscholas.models.UserAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRegistrationRepo extends CrudRepository<UserAccount, Long> {

}


