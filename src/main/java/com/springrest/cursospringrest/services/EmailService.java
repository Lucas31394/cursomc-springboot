package com.springrest.cursospringrest.services;

import org.springframework.mail.SimpleMailMessage;

import com.springrest.cursospringrest.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}