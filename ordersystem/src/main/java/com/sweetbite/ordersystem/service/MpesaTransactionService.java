package com.sweetbite.ordersystem.service;

import com.sweetbite.ordersystem.model.MpesaTransaction;
import com.sweetbite.ordersystem.repository.MpesaTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MpesaTransactionService {

    @Autowired
    private MpesaTransactionRepository transactionRepository;

    public List<MpesaTransaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Optional<MpesaTransaction> getTransactionById(Integer id) {
        return transactionRepository.findById(id);
    }

    public Optional<MpesaTransaction> getTransactionByCode(String code) {
        return transactionRepository.findByMpesaCode(code);
    }

    public MpesaTransaction saveTransaction(MpesaTransaction transaction) {
        return transactionRepository.save(transaction);
    }

    public void deleteTransaction(Integer id) {
        transactionRepository.deleteById(id);
    }
}