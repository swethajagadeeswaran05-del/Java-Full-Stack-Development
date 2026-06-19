package com.example.StudentCourse;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentcourse")
public class StudentCourseController {
    private final StudentCourseService studentCourseService;

    // constructor
    public StudentCourseController(StudentCourseService studentCourseService) {
        this.studentCourseService = studentCourseService;
    }

    @PostMapping
    public StudentCourse addStudentCourse(@RequestBody StudentCourse sc) {
        return studentCourseService.saveStudentCourse(sc);
    }
}
