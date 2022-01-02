package com.example.employeecoursecenter.controller;

import com.example.employeecoursecenter.Entity.Department;
import com.example.employeecoursecenter.response.AllDepartmentResponse;
import com.example.employeecoursecenter.service.DepartmentManagerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/manager")
public class DepartmentManagerController {
    @Resource(name = "departmentManagerService")
    DepartmentManagerService departmentManagerService;

    @GetMapping("getDepartment")
    public ResponseEntity<?> getDepartment(HttpServletRequest request) {
        System.out.println("hello");
        AllDepartmentResponse ds = departmentManagerService.getAllDepartment();
        return ResponseEntity.ok(ds);
    }
}
