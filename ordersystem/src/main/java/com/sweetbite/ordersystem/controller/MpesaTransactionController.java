package com.sweetbite.ordersystem.controller;

import com.sweetbite.ordersystem.model.MpesaTransaction;
import com.sweetbite.ordersystem.service.MpesaTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mpesa")
public class MpesaTransactionController {

    @Autowired
    private MpesaTransactionService transactionService;

    @GetMapping
    public List<MpesaTransaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/{id}")
    public Optional<MpesaTransaction> getTransactionById(@PathVariable Integer id) {
        return transactionService.getTransactionById(id);
    }

    @GetMapping("/code/{mpesaCode}")
    public Optional<MpesaTransaction> getTransactionByCode(@PathVariable String mpesaCode) {
        return transactionService.getTransactionByCode(mpesaCode);
    }

    @PostMapping
    public MpesaTransaction createTransaction(@RequestBody MpesaTransaction transaction) {
        return transactionService.saveTransaction(transaction);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Integer id) {
        transactionService.deleteTransaction(id);
    }
}