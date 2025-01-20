package com.project.java_intensivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.java_intensivo.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
