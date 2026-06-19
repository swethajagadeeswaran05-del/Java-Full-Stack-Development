package com.example.repo;
public class student {
    private Long id;
    private String name;
    public void Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}