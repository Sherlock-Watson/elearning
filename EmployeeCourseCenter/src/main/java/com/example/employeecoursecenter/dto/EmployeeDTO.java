package com.example.employeecoursecenter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Email;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private int employeeId;
    private String employeeName;
    private String gender;
    private int age;
    private String hireDate; // yyyy-mm
    private String phoneNumber;
    private String email;
    private String homeAddress;
    private boolean isManager;
    private boolean isTeacher;
    private String department;
}
