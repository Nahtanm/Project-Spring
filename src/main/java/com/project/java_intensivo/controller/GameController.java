package com.project.java_intensivo.controller;

import java.util.List;

import com.project.java_intensivo.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.java_intensivo.dto.GameMinDTO;
import com.project.java_intensivo.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> games = gameService.findAll();
		return games;
	}

	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		return gameService.findById(id);
	}
	
}
