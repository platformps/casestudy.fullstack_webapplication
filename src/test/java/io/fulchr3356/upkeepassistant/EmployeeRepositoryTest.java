package io.fulchr3356.upkeepassistant;

import io.fulchr3356.upkeepassistant.models.Employee;
import org.junit.Before;
import org.junit.Test;
import io.fulchr3356.upkeepassistant.repositories.EmployeeRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Before
    public void setUp() throws Exception {
        Employee employee1= new Employee("Alice");
        Employee employee2= new Employee("Bob");
        //save employee, verify has ID value after save
        assertNull(employee1.getId());
        assertNull(employee2.getId());//null before save
        this.employeeRepository.save(employee1);
        this.employeeRepository.save(employee2);
        assertNotNull(employee1.getId());
        assertNotNull(employee2.getId());
    }
    @Test
    public void testFetchData(){
        /*Test data retrieval*/
        Optional<Employee> employeeA = employeeRepository.findById(2);
        assertNotNull(employeeA);
        employeeA.ifPresent(employee -> assertEquals("Bob", employee.getFirstName()));
        /*Get all products, list should only have two*/
        Iterable<Employee> employees = employeeRepository.findAll();
        int count = 0;
        for(Employee e : employees){
            count++;
        }
        assertEquals(count, 2);
    }
}
