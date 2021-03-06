package dependency_injection.notificacao;

import dependency_injection.modelo.Cliente;

public class NotificadorEmail implements Notificacao {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s do email %s: %s", 
				cliente.getName(), cliente.getEmail(), mensagem);
	}

}
