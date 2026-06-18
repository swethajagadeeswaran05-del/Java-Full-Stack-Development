package com.example.coffeeshop;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    private final CoffeeService service;
    public CoffeeController(CoffeeService service) {
        this.service = service;
    }
    @PostMapping
    public CoffeeOrder placeOrder(@RequestBody CoffeeOrder order) {
        return service.addOrder(order);
    }
    @GetMapping
    public List<CoffeeOrder> getOrders() {
        return service.getOrders();
    }
}
