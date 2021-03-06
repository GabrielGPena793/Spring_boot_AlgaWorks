package dependency_injection;

import dependency_injection.modelo.Cliente;
import dependency_injection.notificacao.Notificacao;
import dependency_injection.notificacao.NotificadorEmail;
import dependency_injection.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		Cliente client = new Cliente("Gabriel", "gg@hotmai.com");
		
		Notificacao notificador = new NotificadorEmail();
		System.out.println(client.getAtivo());
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativarNotificacao(client, "Agora est? ativado");
		System.out.println();
		System.out.println(client.getAtivo());
	}
}
