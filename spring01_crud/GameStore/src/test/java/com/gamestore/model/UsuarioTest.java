package com.gamestore.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UsuarioTest {
	
		public Usuario usuario;
		public Usuario usuarioNulo = new Usuario();
	
		@Autowired
		private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		@BeforeEach
		public void start() {
			usuario = new Usuario(0L, "João da Silva", "aaaaaaa", "aaaaaaa");
		}
		
		@Test
		@DisplayName("✔ Retorna verdadeiro ,se, todos os valores são diferentes de Nulo ou vazio e as regras de tamanho são obedecidas!")
		void testValidaAtributos() {
			Set<ConstraintViolation<Usuario>> violacao = validator.validate(usuario);
			System.out.println(violacao.toString());
			
			assertTrue(violacao.isEmpty()); // não tem nenhum erro se o que estiver dentro dos parenteses for verdadeiro
		}
		
		@Test
		@DisplayName("👎 Retorna falso ,se, existe algum valor nulo.")
		void testNaoValidaAtributos() {
			Set<ConstraintViolation<Usuario>> violacao = validator.validate(usuario);
			System.out.println(violacao.toString());
			
			assertTrue(violacao.isEmpty()); // não tem nenhum erro se o que estiver dentro dos parenteses for verdadeiro
		}
	
}
