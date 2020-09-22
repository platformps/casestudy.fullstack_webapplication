package com.github.perscholas.repositories;

import com.github.perscholas.models.ServiceCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServiceRepository extends CrudRepository<ServiceCategory, Integer> {
}

