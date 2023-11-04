package com.sricare.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sricare.microservices.service.EmailService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/notification")
@AllArgsConstructor
public class EmailTestController {

   private final EmailService emailService;

   @RequestMapping("/send-email")
   public void sendEmail(){
    emailService.sendEmail("danodya_s@yahoo.com", "Check 1", "Hi");
   }
}

