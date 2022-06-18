package com.gabriel.apilFood.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gabriel.apilFood.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificacao {

	@Autowired
	private NotificadorProperties properties;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Host servidor: " + properties.getHostServer() );
		System.out.println("Porta: " + properties.getHostPort() );
		
		System.out.printf("Notificando %s através do email %s usando SMPT %s: %s", 
				cliente.getName(), cliente.getEmail(), properties.getHostPort(), mensagem);
	}
	
}
