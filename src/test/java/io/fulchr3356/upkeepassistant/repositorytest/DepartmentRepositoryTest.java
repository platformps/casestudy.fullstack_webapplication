package io.fulchr3356.upkeepassistant.repositorytest;

import io.fulchr3356.upkeepassistant.models.Department;
import io.fulchr3356.upkeepassistant.repositories.DepartmentRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentRepositoryTest {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Before
    public void setUp() {
        Department department1= new Department("Clothing");
        Department department2= new Department("Tools");
        //save employee, verify has ID value after save
        assertNull(department1.getId());
        assertNull(department2.getId());//null before save
        this.departmentRepository.save(department1);
        this.departmentRepository.save(department2);
        assertNotNull(department1.getId());
        assertNotNull(department2.getId());
    }
    @Test
    public void testFetchData(){
        /*Test data retrieval*/
        Optional<Department> departmentA = departmentRepository.findById(2);
        assertNotNull(departmentA);
        departmentA.ifPresent(department -> assertEquals("Tools",department.getName()));
        /*Get all products, list should only have two*/
        Iterable<Department> departments = departmentRepository.findAll();
        int count = 0;
        for(Department d : departments){
            count++;
        }
        assertEquals(count, 2);
    }
}
