package com.codegym.model;

import javax.persistence.*;

@Entity
//@Table(name = "music")
public class AppMusic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String songName;
    private String singer;
    private String typeOfSong;
    private String link;

    public AppMusic() {
    }

    public AppMusic(Integer id, String songName, String singer, String typeOfSong, String link) {
        this.id = id;
        this.songName = songName;
        this.singer = singer;
        this.typeOfSong = typeOfSong;
        this.link = link;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTypeOfSong() {
        return typeOfSong;
    }

    public void setTypeOfSong(String typeOfSong) {
        this.typeOfSong = typeOfSong;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}