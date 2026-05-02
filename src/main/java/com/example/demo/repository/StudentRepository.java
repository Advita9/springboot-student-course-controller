package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import com.example.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s.name, c.title FROM Student s JOIN s.courses c")
    List<Object[]> getStudentCourseDetails();
}