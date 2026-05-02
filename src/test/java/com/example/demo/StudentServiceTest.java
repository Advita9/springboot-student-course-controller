package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    StudentService service;

    @Test
    void testSaveStudent() {
        Student s = new Student();
        s.setName("Test");
        s.setEmail("test@mail.com");

        Student saved = service.save(s);

        assertNotNull(saved);
    }
}