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

import com.gamestore.model.Categoria;
import com.gamestore.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
@CrossOrigin("*")
public class CategoriaController {
	@Autowired
	CategoriaRepository tb_categoria_from_db;
	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll(Long idCategoria)
	{
		return ResponseEntity.ok(tb_categoria_from_db.findAll());
	}
	
	@GetMapping("/{id_produto}")
	public ResponseEntity<Categoria> GeById(@PathVariable long idCategoria)
	{
		return tb_categoria_from_db.findById(idCategoria).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome_produto}")
	public ResponseEntity<List<Categoria>> GetByNome(@PathVariable String nomeCategoria)
	{
		return ResponseEntity.ok(tb_categoria_from_db.findAllByDescricaoCategoriaContainingIgnoreCase(nomeCategoria));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> postCategoria (@RequestBody Categoria json_categoria)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(tb_categoria_from_db.save(json_categoria));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> putCategoria(@RequestBody Categoria json_categoria)
	{
		return ResponseEntity.status(HttpStatus.OK).body(tb_categoria_from_db.save(json_categoria));
	}
	
	@DeleteMapping("/{idCategoria}")
	public void delete(@PathVariable long idCategoria)
	{
		tb_categoria_from_db.deleteById(idCategoria);
	}
}
