package com.genfarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genfarmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	List<Produto> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
}
