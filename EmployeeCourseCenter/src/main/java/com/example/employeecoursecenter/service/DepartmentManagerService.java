package com.example.employeecoursecenter.service;

import com.example.employeecoursecenter.Entity.Department;
import com.example.employeecoursecenter.Repository.DepartmentRepository;
import com.example.employeecoursecenter.response.AllDepartmentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentManagerService")
public class DepartmentManagerService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public AllDepartmentResponse getAllDepartment() {
        List<Department> ds = departmentRepository.findAll();
        return new AllDepartmentResponse(ds);
    }
}
