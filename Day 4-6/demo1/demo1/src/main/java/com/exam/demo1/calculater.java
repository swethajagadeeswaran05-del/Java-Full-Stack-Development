package com.exam.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculater {
    @GetMapping("/calc/{a}/{b}")
    public String calc(@PathVariable int a ,@PathVariable int b){
        StringBuilder sb = new StringBuilder();
        sb.append("add ").append(a+b).append("\n");
        sb.append("sub ").append(a-b).append("\n");
        sb.append("Mul ").append(a*b).append("\n");
        if(b!=0){
            sb.append("quo ").append(a/b).append("\n");
            sb.append("rem ").append(a%b).append("\n");
        }else{
            sb.append("quo Division by Zero not allowed\n");
            sb.append("rem Division by Zero not allowed\n");
        }
        return "<pre>"+sb.toString()+"<pre>";//<Pre> preserves formatting
    }
}
