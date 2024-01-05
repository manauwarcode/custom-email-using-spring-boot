package com.emailservice.Custom.Email.Service.controller;

import com.emailservice.Custom.Email.Service.model.EmailDetails;
import com.emailservice.Custom.Email.Service.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendEmail {
    @Autowired
    private EmailService emailService;

    @PostMapping("/sendEmail")
    public ResponseEntity<String> sendEmail(@RequestBody EmailDetails emailDetails){
        ResponseEntity response = null;
        try{
            this.emailService.sendEmail(emailDetails);
            response = ResponseEntity.status(HttpStatus.CREATED).body("Email has been sent successfully");
        } catch (Exception e){
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred due to exception: " + e.getMessage());
        }
        return response;
    }
}
