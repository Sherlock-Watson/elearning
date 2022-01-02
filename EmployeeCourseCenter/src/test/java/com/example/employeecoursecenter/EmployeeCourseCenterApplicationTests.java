package com.example.employeecoursecenter;

import com.example.employeecoursecenter.Entity.Department;
import com.example.employeecoursecenter.Repository.DepartmentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class EmployeeCourseCenterApplicationTests {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testGetDepartmentDB() {
        List<Department> ds = departmentRepository.findAll();
        Assertions.assertTrue(ds.get(0).getDepartment().equals("市场部") || ds.get(0).getDepartment().equals("设计部"));
    }


}
