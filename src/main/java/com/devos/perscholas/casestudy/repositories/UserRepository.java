package com.devos.perscholas.casestudy.repositories;

import org.springframework.data.repository.CrudRepository;
import com.devos.perscholas.casestudy.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
