package com.example.emailSender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.emailSender.services.emailService;

@RestController
public class emailController {
    @Autowired
    private emailService emailService;

    @GetMapping("/basicEmail")
    public String sendBasicEmail() {
        emailService.basicEmail();
        return "Mail sent successfully";
    }

    @GetMapping("/advancedEmail/{email}")
    public String advancedEmail(@PathVariable String email) {
        emailService.advancedEmail(email);
        return "Mail sent successfully";
    }
}
