package com.genfarmacia.controller;

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

import com.genfarmacia.model.Produto;
import com.genfarmacia.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutoController {
	@Autowired
	ProdutoRepository tb_produto_from_db;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAllProduto()
	{
		return ResponseEntity.ok(tb_produto_from_db.findAll());
	}
	
	@GetMapping("/{idProduto}")
	public ResponseEntity<Produto> findByIdProduto(@PathVariable long idProduto)
	{
		return tb_produto_from_db.findById(idProduto).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nomeproduto/{nomeProduto}")
	public ResponseEntity<List<Produto>> findAllByNomeProduto(@PathVariable String nomeProduto)
	{
		return ResponseEntity.ok(tb_produto_from_db.findAllByNomeProdutoContainingIgnoreCase(nomeProduto));
	}
	
	@PostMapping
	public ResponseEntity<Produto> postProduto(@RequestBody Produto json_produto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(tb_produto_from_db.save(json_produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> putProduto(@RequestBody Produto json_produto)
	{
		return ResponseEntity.status(HttpStatus.OK).body(tb_produto_from_db.save(json_produto));
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable long id)
	{
		tb_produto_from_db.deleteById(id);
	}
}
