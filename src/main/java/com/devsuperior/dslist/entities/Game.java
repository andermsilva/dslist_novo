package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer yaer;
    private String genere;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDesctription;
    private String longDescription;

    public Game() {
    }

    public Game(Long id , String title , Integer yaer , String genere , String platforms , Double score , String imgUrl , String shortDesctription , String longDescription) {
        this.id = id;
        this.title = title;
        this.yaer = yaer;
        this.genere = genere;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDesctription = shortDesctription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYaer() {
        return yaer;
    }

    public String getGenere() {
        return genere;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDesctription() {
        return shortDesctription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYaer(Integer yaer) {
        this.yaer = yaer;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setShortDesctription(String shortDesctription) {
        this.shortDesctription = shortDesctription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Game game = (Game) o;
        return id.equals ( game.id );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( id );
    }
}
