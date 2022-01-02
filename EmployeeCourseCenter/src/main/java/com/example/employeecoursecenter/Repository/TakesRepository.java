package com.example.employeecoursecenter.Repository;

import com.example.employeecoursecenter.Entity.Takes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TakesRepository extends JpaRepository<Takes, Integer> {
    // save() 给员工分配课程
    List<Takes> findByStudentId(Integer studentId);
}
