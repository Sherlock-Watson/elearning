package com.example.employeecoursecenter.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Takes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordId;

    @Column(nullable = false)
    private int studentId;
    @Column(nullable = false)
    private int courseId;
    private int score;

    Takes(int studentId, int courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }
}
