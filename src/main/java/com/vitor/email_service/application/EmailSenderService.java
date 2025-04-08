package com.vitor.email_service.application;


import org.springframework.stereotype.Service;

import com.vitor.email_service.adapters.EmailSenderGateway;
import com.vitor.email_service.core.EmailSenderUseCase;

//contrato da aplicação com o nosso gateaway
@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    public EmailSenderService(EmailSenderGateway emailSenderGateway){
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body){
        this.emailSenderGateway.sendEmail(to,subject,body);
    }
    
}
