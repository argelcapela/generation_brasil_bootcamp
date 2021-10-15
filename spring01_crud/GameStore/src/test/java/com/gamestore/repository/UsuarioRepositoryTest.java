package com.gamestore.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.gamestore.model.Usuario;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest{
	@Autowired
		private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	 void start() {
		//LocalDate data = LocalDate.parse("2000-07-22", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		Usuario usuario = new Usuario(0, "pedro", "pedro", "pedro");
		if(!usuarioRepository.findByLoginContainingIgnoreCase(usuario.getLogin()).isPresent())
			usuarioRepository.save(usuario);
		
		usuario = new Usuario(0, "thiago", "thiago", "thiago");
		if(!usuarioRepository.findByLoginContainingIgnoreCase(usuario.getLogin()).isPresent())
			usuarioRepository.save(usuario);
		
		usuario = new Usuario(0, "joão", "joão", "joão");
		if(!usuarioRepository.findByLoginContainingIgnoreCase(usuario.getLogin()).isPresent())
			usuarioRepository.save(usuario);
		
		usuario = new Usuario(0, "judas", "judas", "judas");
		if(!usuarioRepository.findByLoginContainingIgnoreCase(usuario.getLogin()).isPresent())
			usuarioRepository.save(usuario);
	}
	
	@Test
	@DisplayName("💾 Retorna o nome!")
	void findByLoginTest() throws Exception {
		Usuario usuario = usuarioRepository.findByLogin("pedro");
		assertTrue(usuario.getLogin().equals("pedro"));
	}
	
	@Test
	@DisplayName("💾 Retorna 3 nomes!")
	void findByNomeContainingIgnoreCaseRetornaTresUsuarios() throws Exception {
		List<Usuario> usuarios = usuarioRepository.findByNomeCompletoContainingIgnoreCase("jesus");
		assertEquals(3, usuarios.size());
	}
	
	@AfterAll
	public void end() {
		usuarioRepository.deleteAll();
	}
}
