package com.sweetbite.ordersystem.repository;

import com.sweetbite.ordersystem.model.CakeOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CakeOrderRepository extends JpaRepository<CakeOrder, Long> {
}