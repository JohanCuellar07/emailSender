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

    @GetMapping("/newAccountEmail/{email}")
    public String newAccountEmail(@PathVariable String email) {
        emailService.newAccountEmail(email);
        return "Mail sent successfully";
    }

    @GetMapping("/RecoverPasswordEmail/{email}")
    public String RecoverPasswordEmail(@PathVariable String email) {
        emailService.RecoverPasswordEmail(email);
        return "Mail sent successfully";
    }

    @GetMapping("/codeActivationEmail/{email}")
    public String codeActivationEmail(@PathVariable String email) {
        emailService.codeActivationEmail(email);
        return "Mail sent successfully";
    }

    @GetMapping("/changedPasswordEmail/{email}")
    public String changedPasswordEmail(@PathVariable String email) {
        emailService.changedPasswordEmail(email);
        return "Mail sent successfully";
    }

    @GetMapping("/lowStockEmail/{email}")
    public String lowStockEmail(@PathVariable String email) {
        emailService.lowStockEmail(email);
        return "Mail sent successfully";
    }

    @GetMapping("/purchaseEmail/{email}")
    public String purchaseEmail(@PathVariable String email) {
        emailService.purchaseEmail(email);
        return "Mail sent successfully";
    }
}
