package com.example.repo;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/students")
public class studentcontroller {
    private final Repository repo=new Repository();
    @GetMapping
    public List<student> getstudents(){
        return repo.findall();
    }
    @PostMapping
    public student addstudent(@RequestBody student s){
        repo.save(s);
        return s;
    }
}
