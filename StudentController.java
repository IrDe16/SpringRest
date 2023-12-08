package com.irinadenman.demo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/searchByName")
    public List<Student> searchByName(@RequestParam String name) {
        return studentService.searchByName(name);
    }

    @GetMapping("/searchByGpa")
    public List<Student> searchByGpa(@RequestParam double gpa) {
        return studentService.searchByGpa(gpa);
    }

    @GetMapping("/averageGpaByName")
    public double getAverageGpaByName(@RequestParam String name) {
        return studentService.getAverageGpaByName(name);
    }
}