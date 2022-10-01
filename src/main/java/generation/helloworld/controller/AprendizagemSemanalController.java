package generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizagem-semanal")


public class AprendizagemSemanalController {
	
	@GetMapping
	public String aprendizagemSemanal() {
		
		return "<br><li>Aprender novos comandos do Spring, <br> <li>Aprender novas técnicas a serem aplicadas do"
				+ "Projeto Integrador e Blog Pessoal";				

}
	}