package com.sricare.microservices.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;
    private String email;
    // Other user properties (add more as needed)

    public User() {
        // Default constructor
    }

    // Getters and setters for the class properties
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Add getters and setters for other properties as needed
}

