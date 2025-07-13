package com.sweetbite.ordersystem.service;

import com.sweetbite.ordersystem.model.CakeOrder;
import com.sweetbite.ordersystem.repository.CakeOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CakeOrderService {

    private final CakeOrderRepository repository;

    public CakeOrderService(CakeOrderRepository repository) {
        this.repository = repository;
    }

    public CakeOrder saveOrder(CakeOrder order) {
        return repository.save(order);
    }

    public List<CakeOrder> getAllOrders() {
        return repository.findAll();
    }

    public Optional<CakeOrder> getOrderById(Long id) {
        return repository.findById(id);
    }

    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }
}