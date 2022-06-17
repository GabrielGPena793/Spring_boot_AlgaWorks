package com.gabriel.apilFood.service;

import org.springframework.stereotype.Component;

import com.gabriel.apilFood.modelo.Cliente;
import com.gabriel.apilFood.notificacao.Notificacao;

@Component
public class AtivacaoClienteService {

	private Notificacao notificacao;

	public AtivacaoClienteService(Notificacao notificacao) {
		this.notificacao = notificacao;
	}
	
	public void ativarNotificacao(Cliente cliente, String mensagem) {
		cliente.setAtivo(true);
		
		notificacao.notificar(cliente, mensagem);
	}
}
