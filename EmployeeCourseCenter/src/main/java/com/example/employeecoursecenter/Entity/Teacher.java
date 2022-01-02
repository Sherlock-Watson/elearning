package com.example.employeecoursecenter.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
//    @OneToOne
//    @JoinColumn(name = "teacher_id", referencedColumnName = "employee_id")
    private int teacherId;

    @Column
    private String startTeachingTime;
}
