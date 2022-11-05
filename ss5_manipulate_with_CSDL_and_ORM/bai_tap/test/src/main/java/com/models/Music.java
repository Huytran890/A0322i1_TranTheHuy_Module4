package com.models;

import javax.persistence.*;

@Entity
@Table(name = "music_all")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String artist;
    private String kindOfMusic;
    private String file;

    public Music() {
    }

    public Music(int id, String name, String artist, String kindOfMusic, String file) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.kindOfMusic = kindOfMusic;
        this.file = file;
    }

    public Music(String name, String artist, String kindOfMusic, String file) {
        this.name = name;
        this.artist = artist;
        this.kindOfMusic = kindOfMusic;
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
