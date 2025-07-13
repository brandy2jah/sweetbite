package com.sweetbite.ordersystem.repository;

import com.sweetbite.ordersystem.model.MpesaTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MpesaTransactionRepository extends JpaRepository<MpesaTransaction, Integer> {
    Optional<MpesaTransaction> findByMpesaCode(String mpesaCode);
}