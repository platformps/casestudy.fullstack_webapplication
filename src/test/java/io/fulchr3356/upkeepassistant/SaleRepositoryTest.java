package io.fulchr3356.upkeepassistant;


import io.fulchr3356.upkeepassistant.models.Sale;
import io.fulchr3356.upkeepassistant.repositories.SaleRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SaleRepositoryTest {
    @Autowired
    private SaleRepository saleRepository;
    @Before
    public void setUp() {
        Sale budget1= new Sale("Clothing Budget");
        Sale budget2= new Sale("Tools Budget");
        //save employee, verify has ID value after save
        assertNull(budget1.getId());
        assertNull(budget2.getId());//null before save
        this.saleRepository.save(budget1);
        this.saleRepository.save(budget2);
        assertNotNull(budget1.getId());
        assertNotNull(budget2.getId());
    }
    @Test
    public void testFetchData(){
        /*Test data retrieval*/
        Optional<Sale> departmentA = saleRepository.findById(2);
        assertNotNull(departmentA);
        departmentA.ifPresent(sale -> Assertions.assertEquals(0.00,sale.getAmount()));
        /*Get all products, list should only have two*/
        Iterable<Sale> budgets= saleRepository.findAll();
        int count = 0;
        for(Sale s : budgets){
            count++;
        }
        assertEquals(count, 2);
    }
}
