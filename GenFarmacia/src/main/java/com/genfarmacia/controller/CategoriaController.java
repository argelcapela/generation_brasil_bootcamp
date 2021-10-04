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

import com.genfarmacia.model.Categoria;
import com.genfarmacia.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
@CrossOrigin("*")
public class CategoriaController {
	@Autowired
	CategoriaRepository tb_categoria_from_db;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll()
	{
		return ResponseEntity.ok(tb_categoria_from_db.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> findAllById(@PathVariable long id)
	{
		return tb_categoria_from_db.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> findAllByDescricao(@PathVariable String descricao)
	{
		return ResponseEntity.ok(tb_categoria_from_db.findAllByDescricaoCategoriaContainingIgnoreCase(descricao));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> postTema(@RequestBody Categoria json_tema)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(tb_categoria_from_db.save(json_tema));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> putTema(@RequestBody Categoria json_tema)
	{
		return ResponseEntity.status(HttpStatus.OK).body(tb_categoria_from_db.save(json_tema));
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable long id)
	{
		tb_categoria_from_db.deleteById(id);
	}
	
}
