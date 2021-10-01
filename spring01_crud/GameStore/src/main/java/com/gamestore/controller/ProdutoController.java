package com.gamestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamestore.model.Produto;
import com.gamestore.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutoController {
	@Autowired
	ProdutoRepository tb_produto_from_db;
	
	@GetMapping
	public ResponseEntity<List<Produto>> GetAll(Long idProduto)
	{
		return ResponseEntity.ok(tb_produto_from_db.findAll());
	}
	
	@GetMapping("/{id_produto}")
	public ResponseEntity<Produto> GeById(@PathVariable long idProduto)
	{
		return tb_produto_from_db.findById(idProduto).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome_produto}")
	public ResponseEntity<List<Produto>> GetByNome(@PathVariable String nomeProduto)
	{
		return ResponseEntity.ok(tb_produto_from_db.findAllByNomeContainingIgnoreCase(nomeProduto));
	}
	
	@PostMapping
	public ResponseEntity<Produto> postCategoria (@RequestBody Produto json_produto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(tb_produto_from_db.save(json_produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> putCategoria(@RequestBody Produto json_produto)
	{
		return ResponseEntity.status(HttpStatus.OK).body(tb_produto_from_db.save(json_produto));
	}
	
	@DeleteMapping("/{idProduto}")
	public void delete(@PathVariable long idProduto)
	{
		tb_produto_from_db.deleteById(idProduto);
	}
}
