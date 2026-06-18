package com.example.coffeeshop;
public class CoffeeOrder {
    private int id;
    private String customerName;
    private String coffeeType;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCoffeeType() {
        return coffeeType;
    }
    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }
}