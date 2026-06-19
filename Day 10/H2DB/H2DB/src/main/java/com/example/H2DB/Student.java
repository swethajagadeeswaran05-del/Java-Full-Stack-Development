package com.example.H2DB;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.aot.generate.Generated;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Student(){}
        public Student(String name){
            this.name=name;
        }
        public Long getId(){ return id;}
    public String getName(){return name;}
}

