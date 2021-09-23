package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio2")
public class exercicio2Controller {
	@GetMapping
	public String exercicio2()
	{
		String html = "<p><b>Atividade 2 Spring-boot (minha segunda aplicação):</b>\r\n"
				+ "Crie uma aplicação spring de hello world.\r\n"
				+ "\r\n"
				+ "A aplicação deverá conter um end-point que retorna\r\n"
				+ "uma string com os seus objetivos de aprendizagem para\r\n"
				+ "essa semana.</p>";
		html += "<p>Meu plano é:</p>";
		html += "<ol>";
		html += "<li>Gerenciar melhor tempo atráves de Foco no agora, entrega e cronograma;</li>";
		html += "<li>Spring Boot, praticar bastante e desenvolver meu blog pessoal.</li>";
		html += "</ol>";
		return (html); 
	}
}
