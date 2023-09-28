package com.sricare.microservices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private double amount;
    private String status;

    public void setStatus(String paid) {
        return;
    }

    public Object getId() {
        return null;
    }

    public Object getAmount() {
        return null;
    }

    public Object getStatus() {
        return null;
    }


}
