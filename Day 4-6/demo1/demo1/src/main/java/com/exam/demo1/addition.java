package com.exam.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addition {
    @GetMapping("/add/{num1}/{num2}")
    public int dis(@PathVariable int num1,@PathVariable int num2){
        return (num1+num2);
    }
    @GetMapping("/addd/{num1}/{num2}")
    public String disp(@PathVariable int num1,@PathVariable int num2) {
        return "Addition:" +(num1 + num2);
    }
    @GetMapping("/sub/{num1}/{num2}")
    public String sub(@PathVariable int num1,@PathVariable int num2) {
        return "Subtraction:" +(num1 - num2);
    }
    @GetMapping("/mul/{num1}/{num2}")
    public String mul(@PathVariable int num1,@PathVariable int num2) {
        return "Multiplication:" +(num1*num2);
    }
    @GetMapping("/div/{num1}/{num2}")
    public String div(@PathVariable int num1,@PathVariable int num2) {
        return "Division:" +(num1/num2);
    }

    @GetMapping("/mod/{num1}/{num2}")
    public String rem(@PathVariable int num1,@PathVariable int num2) {
        return "Modulas:" +(num1%num2);
    }
    @GetMapping("/add/oe/{num1}/{num2}")
    public String oe(@PathVariable int num1,@PathVariable int num2){
        int res=num1+num2;
        if(res%2==0){
            return "EVEN";
        }else{
            return "ODD";
        }
    }
}
