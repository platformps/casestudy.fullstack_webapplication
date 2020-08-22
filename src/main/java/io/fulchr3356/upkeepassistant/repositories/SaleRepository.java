package io.fulchr3356.upkeepassistant.repositories;

import io.fulchr3356.upkeepassistant.models.Sale;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface SaleRepository extends CrudRepository<Sale,Integer> {
    Optional<Sale> findById(Integer id);

}