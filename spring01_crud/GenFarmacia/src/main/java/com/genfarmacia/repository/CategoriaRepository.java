package com.genfarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genfarmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	List<Categoria> findAllByDescricaoCategoriaContainingIgnoreCase(String descricaoCategoria); 
}
