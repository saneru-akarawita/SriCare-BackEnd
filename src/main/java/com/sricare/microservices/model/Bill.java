package com.sricare.microservices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private double amount;
    private String status;

    public void setStatus(String paid) {
    }

    public Object getId() {
    }

    public Object getAmount() {
    }

    public Object getStatus() {
    }

    // getters and setters

}
