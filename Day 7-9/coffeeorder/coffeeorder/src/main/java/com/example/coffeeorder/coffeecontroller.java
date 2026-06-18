package com.example.coffeeorder;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/coffee")
public class coffeecontroller {
    private final coffeeservice service;
    public coffeecontroller(coffeeservice service){
        this.service=service;
    }
    @PostMapping("/{type}")
    public String orderCoffee(@PathVariable String type){
        return service.orderCoffee(type);
    }
    @GetMapping
    public List<String> getOrders(){
        return service.getOrders();
    }

}

