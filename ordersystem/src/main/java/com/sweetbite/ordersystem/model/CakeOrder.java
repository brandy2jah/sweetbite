package com.sweetbite.ordersystem.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class CakeOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String phoneNumber;
    private String designDescription; // Short text description
    private double price;

    private LocalDateTime orderTime;
    private String status; // e.g., "pending", "paid", "delivered"

    public CakeOrder() {
        this.orderTime = LocalDateTime.now();
        this.status = "pending";
    }
    public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getCustomerName() {
    return customerName;
}

public void setCustomerName(String customerName) {
    this.customerName = customerName;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public String getDesignDescription() {
    return designDescription;
}

public void setDesignDescription(String designDescription) {
    this.designDescription = designDescription;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

public LocalDateTime getOrderTime() {
    return orderTime;
}

public void setOrderTime(LocalDateTime orderTime) {
    this.orderTime = orderTime;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}
}