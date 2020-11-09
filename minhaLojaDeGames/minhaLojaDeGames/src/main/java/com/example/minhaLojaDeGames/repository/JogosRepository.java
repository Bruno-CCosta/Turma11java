package com.example.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.minhaLojaDeGames.model.Jogos;

public interface JogosRepository extends JpaRepository<Jogos, Long>{
	public List<Jogos> findAllByTituloContainingIgnoreCase (String titulo);

}
