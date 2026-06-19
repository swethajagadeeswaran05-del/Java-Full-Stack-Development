package com.example.StudentCourse;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;
    // constructor
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }
}
