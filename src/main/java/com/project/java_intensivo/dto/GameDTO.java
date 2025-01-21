package com.project.java_intensivo.dto;

import com.project.java_intensivo.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String plataform;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {
    }

    public GameDTO(Game game){

        // Copia as propriedades da entidade recebida para a classe
        BeanUtils.copyProperties(game, this);

//        this.id = game.getId();
//        this.title = game.getTitle();
//        this.year = game.getYear();
//        this.genre = game.getGenre();
//        this.plataform = game.getPlataform();
//        this.score = game.getScore();
//        this.imgUrl = game.getImgUrl();
//        this.longDescription = game.getLongDescription();
//        this.shortDescription = game.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GameDTO gameDTO = (GameDTO) o;
        return Objects.equals(id, gameDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
