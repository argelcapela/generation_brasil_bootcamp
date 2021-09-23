package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio1")
public class exercicio1Controller {
	@GetMapping
	public String exercicio1()
	{
		String html = "";
		html += "<p><b>Atividade 1 Spring-boot (minha primeira aplicação):</b>\r\n"
				+ "Crie uma aplicação spring de hello world.\r\n"
				+ "\r\n"
				+ "A aplicação deverá conter um end-point que retorna\r\n"
				+ "uma string com as habilidades e mentalidades que você\r\n"
				+ "utilizou para realizar essa atividade.</p>";
		html += "<h1>Mentalidade Utilizada: Crescimento</h1>";
		html += "Tem que acreditar que vai funcionar!";
		html += "<h1>Habilidade: Persistência</h1>";
		html += "Tem que persistir porque quase sempre não funciona de primeira!";
		return (html);
	}
}
