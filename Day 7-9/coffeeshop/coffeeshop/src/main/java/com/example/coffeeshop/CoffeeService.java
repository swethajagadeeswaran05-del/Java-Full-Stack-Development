package com.example.coffeeshop;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class CoffeeService {
    private List<CoffeeOrder> orders = new ArrayList<>();
    private int nextId = 1;
    public CoffeeOrder addOrder(CoffeeOrder order) {
        order.setId(nextId++);
        orders.add(order);
        return order;
    }
    public List<CoffeeOrder> getOrders() {
        return orders;
    }
}

