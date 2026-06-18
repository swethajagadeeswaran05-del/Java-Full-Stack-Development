package com.example.coffeeorder;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class coffeeservice {
private List<String> orders=new ArrayList<>();

//bussiness Logic:add a coffee order
    public String orderCoffee(String type){
        orders.add(type);
        return "order placed for: "+type;
    }
    //Business Logic: list all orders
    public List<String> getOrders(){
        return orders;
    }
}
