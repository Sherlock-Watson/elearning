package com.example.employeecoursecenter.Entity;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @Column
    private String courseName;
    private String courseContent;
    private int courseType;
    private String department;
    private boolean status;
    // true表示已结课，false表示未结课
//    @ManyToOne
//    @JoinColumn(name = "teacher_id", referencedColumnName = "employee_id")
    private int teacherId;
}
