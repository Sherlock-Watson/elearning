package com.example.employeecoursecenter.response;

import com.example.employeecoursecenter.Entity.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class AllDepartmentResponse {
    List<Department> department;
}
