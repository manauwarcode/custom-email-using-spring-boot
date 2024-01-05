package com.emailservice.Custom.Email.Service.service;


import com.emailservice.Custom.Email.Service.model.EmailDetails;


public interface EmailService {

    void sendEmail(EmailDetails emailDetails);
}
