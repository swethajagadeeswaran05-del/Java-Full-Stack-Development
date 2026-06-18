package com.example.fullstackproject;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name="students")//custom table name
@Data//Lombok generates getters and setters,toString,equals ,hashCode
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="student_id")//custom column name
    private Long id;
    @Column(name="student_name",nullable = false,length=100)
    private String name;
    private String department;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="profile_id",referencedColumnName = "id")
    private Profile profile;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Course> courses;//one student has many courses

}