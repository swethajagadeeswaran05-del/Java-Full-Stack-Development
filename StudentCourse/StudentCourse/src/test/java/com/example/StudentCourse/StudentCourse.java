package com.example.StudentCourse;

import jakarta.persistence.*;

@Entity
@Table(name = "student_course")
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stdid;

    private String stdname;

    // Getters and Setters
    public Long getStdid() { return stdid; }
    public void setStdid(Long stdid) { this.stdid = stdid; }

    public String getStdname() { return stdname; }
    public void setStdname(String stdname) { this.stdname = stdname; }
}
