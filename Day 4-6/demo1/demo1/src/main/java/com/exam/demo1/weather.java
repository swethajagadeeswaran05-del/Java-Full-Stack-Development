package com.exam.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class weather {
    @GetMapping("/climate/{n}")
    public String weat(@PathVariable int n){
        if(n<0){
            return "Shivering";
        }else if(n>=0 && n<=15){
            return "Chill";
        }else if(n>15 && n<=24){
            return "Happy";
        }else if(n>24 && n<=30){
            return "Towards Hot";
        }else if(n>30 && n<=32){
            return "Hotter";
        }else{
            return "OMG";
        }
    }
    @GetMapping("/intro/{name}/{city}/{course}")
    public String intro(@PathVariable String name,@PathVariable String city,@PathVariable String course){
        return "Hello I am "+name+",from"+city+"welcome to "+course;
    }
}
