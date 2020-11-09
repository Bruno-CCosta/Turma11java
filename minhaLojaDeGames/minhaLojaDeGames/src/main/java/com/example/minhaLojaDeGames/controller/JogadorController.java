package com.example.minhaLojaDeGames.controller;

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

import com.example.minhaLojaDeGames.model.Jogador;
import com.example.minhaLojaDeGames.repository.JogadorRepository;


@RestController
@RequestMapping("/jogador")
@CrossOrigin("*")
public class JogadorController {

	@Autowired
	private JogadorRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Jogador>> findAllUsuario(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Jogador> findByIdUsuario(@PathVariable Long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Jogador> post (@RequestBody Jogador jogador){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(jogador));
	}

	@PutMapping
	public ResponseEntity<Jogador> put (@RequestBody Jogador jogador) {
		return ResponseEntity.ok(repository.save(jogador));			
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}