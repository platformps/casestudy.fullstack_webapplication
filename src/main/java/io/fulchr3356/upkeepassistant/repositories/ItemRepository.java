package io.fulchr3356.upkeepassistant.repositories;

import io.fulchr3356.upkeepassistant.models.Item;
import io.fulchr3356.upkeepassistant.models.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item,Integer> {
    List<Item> findAllByUserId(String name);
}
