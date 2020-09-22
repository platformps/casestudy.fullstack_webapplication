package com.devos.perscholas.casestudy.repositories;

import org.springframework.data.repository.CrudRepository;
import com.devos.perscholas.casestudy.models.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUserName(String userName);
}
