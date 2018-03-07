package com.example.dao;

import com.example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {
    Student findStudentByNameAndSurnameAndNumber(String studentName, String studentSurname, Integer studentNumber);
}
