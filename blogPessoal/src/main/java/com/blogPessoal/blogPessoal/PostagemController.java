package com.blogPessoal.blogPessoal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repositoty;
	
	@GetMapping
	(path = {"/{titulo}"})
	public ResponseEntity<?> findById(@PathVariable String titulo){
	   return (repositoty.findAllByTituloContainingIgnoreCase(titulo))
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}

	
}

/* GET
public ResponseEntity<List<Postagem>> GetAll(Long idPostagem)
{
	return ResponseEntity.ok(repositoty.findAll(idPostagem));
}*/

/* GET SPECIFIC
(path = {"/{id}"})
public ResponseEntity<?> findById(@PathVariable long id){
   return repositoty.findById(id)
           .map(record -> ResponseEntity.ok().body(record))
           .orElse(ResponseEntity.notFound().build());
}
*/
