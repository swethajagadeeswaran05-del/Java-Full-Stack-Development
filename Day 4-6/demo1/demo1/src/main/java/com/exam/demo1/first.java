package com.exam.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class first {
    @GetMapping("/hi")
    public String display(){
        return "Hi";
    }
    @GetMapping("/hi/{name}")
    public String name(@PathVariable String name){
        return "Hi "+name;
    }
    @GetMapping("{name}")
    public String namee(@PathVariable String name){
        String n=name.toLowerCase();
        if(name.equals("swetha")){
            return "Its My name";
        }else{
            return "I Dont Know";
        }
    }
}
