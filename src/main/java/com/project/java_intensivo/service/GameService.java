package com.project.java_intensivo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.java_intensivo.dto.GameMinDTO;
import com.project.java_intensivo.entities.Game;
import com.project.java_intensivo.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> games = gameRepository.findAll();
		return games.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
