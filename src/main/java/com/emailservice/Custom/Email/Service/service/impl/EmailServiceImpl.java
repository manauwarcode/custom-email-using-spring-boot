package com.emailservice.Custom.Email.Service.service.impl;

import com.emailservice.Custom.Email.Service.model.EmailDetails;
import com.emailservice.Custom.Email.Service.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender emailSender;

    @Override
    public void sendEmail(EmailDetails emailDetails) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(emailDetails.getSender());
        simpleMailMessage.setTo(emailDetails.getReceiver());
        simpleMailMessage.setText(emailDetails.getMessageBody());
        this.emailSender.send(simpleMailMessage);

    }
}
