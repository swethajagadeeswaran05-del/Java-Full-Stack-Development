package com.example.repo;
import java.util.ArrayList;
import java.util.List;
public class Repository {
    private final List<student> students = new ArrayList<>();
    public List<student> findall() {
        return students;
    }
    public void save(student s){
        students.add(s);
    }
}
