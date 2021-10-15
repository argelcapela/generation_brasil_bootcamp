package com.gamestore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamestore.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findByLogin(String login);
	
	public List<Usuario> findByNomeCompletoContainingIgnoreCase(String nomeCompleto);
	
	public Optional<Usuario> findByLoginContainingIgnoreCase(String login);

	

}
