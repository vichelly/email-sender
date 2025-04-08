package com.vitor.email_service.core;

//definimos o contrato de um email, no caso se usar qualquer outro serviço ele não será alterado
public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
} 
