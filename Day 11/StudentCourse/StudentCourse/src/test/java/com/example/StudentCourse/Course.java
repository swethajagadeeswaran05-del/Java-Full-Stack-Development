package com.example.StudentCourse;

import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    @ManyToOne
    @JoinColumn(name = "stdid", referencedColumnName = "stdid")
    private StudentCourse studentCourse;

    private String cname;

    // Getters and Setters
    public Long getCid() { return cid; }
    public void setCid(Long cid) { this.cid = cid; }

    public StudentCourse getStudentCourse() { return studentCourse; }
    public void setStudentCourse(StudentCourse studentCourse) { this.studentCourse = studentCourse; }

    public String getCname() { return cname; }
    public void setCname(String cname) { this.cname = cname; }
}
