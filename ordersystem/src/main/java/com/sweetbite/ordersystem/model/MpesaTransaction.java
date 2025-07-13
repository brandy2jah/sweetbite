package com.sweetbite.ordersystem.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mpesa_transactions")
public class MpesaTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private CakeOrder order;

    @Column(nullable = false, unique = true)
    private String mpesaCode;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private LocalDateTime transactionDate = LocalDateTime.now();

    // Getters and Setters

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public CakeOrder getOrder() {
        return order;
    }

    public void setOrder(CakeOrder order) {
        this.order = order;
    }

    public String getMpesaCode() {
        return mpesaCode;
    }

    public void setMpesaCode(String mpesaCode) {
        this.mpesaCode = mpesaCode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
}
