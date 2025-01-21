package com.project.java_intensivo.dto;

import com.project.java_intensivo.entities.GameList;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList gameList) {
        this.id = gameList.getId();
        this.name = gameList.getGame();
    }

    public GameListDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GameListDTO that = (GameListDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
