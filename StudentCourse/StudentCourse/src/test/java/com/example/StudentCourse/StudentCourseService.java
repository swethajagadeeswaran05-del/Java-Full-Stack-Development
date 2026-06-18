package com.example.StudentCourse;

import org.springframework.stereotype.Service;

@Service
public class StudentCourseService {
    private final StudentCourseRepository studentCourseRepository;

    // constructor
    public StudentCourseService(StudentCourseRepository studentCourseRepository) {
        this.studentCourseRepository = studentCourseRepository;
    }

    public StudentCourse saveStudentCourse(StudentCourse sc) {
        return studentCourseRepository.save(sc);
    }
}
