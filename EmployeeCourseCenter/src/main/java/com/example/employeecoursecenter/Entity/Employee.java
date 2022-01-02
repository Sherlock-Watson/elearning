package com.example.employeecoursecenter.Entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Collection;
import java.util.List;

@Entity
@ToString
@RequiredArgsConstructor
@Getter
@Setter
public class Employee implements UserDetails {
    private static final String MALE = "男";
    private static final String FEMALE = "女";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    @Column
    private String employeeName;

    @Column
    private String gender;

    @Column
    private int age;

    @Column
    private String hireDate;
    // 以yyyy-mm的形式传给我

    @Column
    private String phoneNumber;

    @Column
    @Email
    private String email;

    @Column
    private String homeAddress;

    @Column
    private boolean isManager;

    @Column
    private boolean isTeacher;

    @Column
    private String department;

    @Transient
    private List<? extends GrantedAuthority> authorities;

    public Employee(int employeeId, String employeeName, String gender,
                    int age, String hireDate, String phoneNumber, @Email String email,
                    String homeAddress, boolean isManager, boolean isTeacher, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gender = gender;
        this.age = age;
        this.hireDate = hireDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.homeAddress = homeAddress;
        this.isManager = isManager;
        this.isTeacher = isTeacher;
        this.department = department;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return "null";
    }

    @Override
    public String getUsername() {
        return String.valueOf(employeeId);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
