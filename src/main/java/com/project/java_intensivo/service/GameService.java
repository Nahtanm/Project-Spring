package com.project.java_intensivo.service;

import java.util.List;

import com.project.java_intensivo.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.java_intensivo.dto.GameMinDTO;
import com.project.java_intensivo.entities.Game;
import com.project.java_intensivo.repository.GameRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true) //Garantir a exercução do método será realizada
	public GameDTO findById(Long id){
		Game game = gameRepository.findById(id).get();
		return new GameDTO(game);
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> games = gameRepository.findAll();
		return games.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
