package com.vitor.email_service.application;

import org.springframework.beans.factory.annotation.Autowired;

import com.vitor.email_service.core.EmailSenderUseCase;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway){
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body){

    }
    
}
