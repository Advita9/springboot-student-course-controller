package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;


@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public String list(Model model) {
        model.addAttribute("students", service.getAll());
        return "student-list";
    }

    @GetMapping("/add")
    public String form(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Student student, Model model) {

        System.out.println(student.getName());
        System.out.println(student.getEmail());

        try {
            service.save(student);
        } catch (Exception e) {
            e.printStackTrace();   // 🔥 ADD THIS
            model.addAttribute("error", "Error saving student!");
            return "student-form";
        }

        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Student s = service.getAll().stream()
            .filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        model.addAttribute("student", s);
        return "student-update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Student student) {
        service.save(student);
        return "redirect:/students";
    }

    @GetMapping("/report")
    public String report(Model model) {
        model.addAttribute("data", service.getJoinData());
        return "report";
    }
}