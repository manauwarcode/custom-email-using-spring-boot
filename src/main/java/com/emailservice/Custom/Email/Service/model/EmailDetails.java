package com.emailservice.Custom.Email.Service.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {
    String sender;
    String receiver;
    String messageBody;
}
