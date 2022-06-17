package com.gabriel.apilFood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gabriel.apilFood.modelo.Cliente;
import com.gabriel.apilFood.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("Gabriel", "gabriel@hotmail.com");	
		
		ativacaoClienteService.ativarNotificacao(joao, "agora está ativo");
		
		return "Bom essa alteração em ?";
	}
}
