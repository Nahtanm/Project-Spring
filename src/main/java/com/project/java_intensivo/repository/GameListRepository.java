package com.project.java_intensivo.repository;

import com.project.java_intensivo.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
