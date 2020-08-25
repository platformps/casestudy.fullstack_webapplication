package io.fulchr3356.upkeepassistant.repositories;

import io.fulchr3356.upkeepassistant.models.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SaleRepository extends JpaRepository<Sale,Integer> {
    Optional<Sale> findById(Integer id);

}