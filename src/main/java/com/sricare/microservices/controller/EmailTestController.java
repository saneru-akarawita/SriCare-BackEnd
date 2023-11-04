package com.sricare.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailTestController {

    @Autowired
    private JavaMailSender javaMailSender;

    @GetMapping("/send-test-email")
    public String sendTestEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("gagiibgsv7@gmail.com@example.com"); // Replace with the recipient's email address
        message.setSubject("Test Email");
        message.setText("This is a test email from Spring Boot.");

        javaMailSender.send(message);

        return "Test email sent!";
    }
}

