package com.sweetbite.ordersystem.controller;

import com.sweetbite.ordersystem.model.CakeOrder;
import com.sweetbite.ordersystem.service.CakeOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin
public class CakeOrderController {

    private final CakeOrderService service;

    public CakeOrderController(CakeOrderService service) {
        this.service = service;
    }

    @PostMapping
    public CakeOrder createOrder(@RequestBody CakeOrder order) {
        return service.saveOrder(order);
    }

    @GetMapping
    public List<CakeOrder> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public CakeOrder getOrder(@PathVariable Long id) {
        return service.getOrderById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        service.deleteOrder(id);
    }
}
