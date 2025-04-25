package com.example.emailSender.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class emailService {
    @Autowired
    private JavaMailSender JavaMailSender;

    public void basicEmail() {
        try {
            //destinatario
            String addressMail = "cuellarjohan.07@gmail.com";
            //asunto
            String subject = "Este es un correo de prueba";
            //cuerpo de correo
            String bodyMail = "Correo prueba";

            emailSender(addressMail, subject, bodyMail);
            
        } catch (Exception e) {

        }
    }

    public boolean emailSender(String addressMail, String subject, String bodyMail) throws MessagingException {
        try {
            MimeMessage message = JavaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(addressMail);
            helper.setSubject(subject);
            helper.setText(bodyMail);
            JavaMailSender.send(message);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
