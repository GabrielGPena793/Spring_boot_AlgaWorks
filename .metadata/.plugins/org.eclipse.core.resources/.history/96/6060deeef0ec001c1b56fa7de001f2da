package dependency_injection.service;

import dependency_injection.modelo.Cliente;
import dependency_injection.notificacao.Notificacao;

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
