package com.codegym.educationmanager.repository;

import com.codegym.educationmanager.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
    Student findStudentByUsername(String username);
}
