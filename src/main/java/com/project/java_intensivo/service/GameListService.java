package com.project.java_intensivo.service;

import com.project.java_intensivo.dto.GameListDTO;
import com.project.java_intensivo.entities.GameList;
import com.project.java_intensivo.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> gameLists = gameListRepository.findAll();
        return gameLists.stream().map(x -> new GameListDTO(x)).toList();
    }

}
