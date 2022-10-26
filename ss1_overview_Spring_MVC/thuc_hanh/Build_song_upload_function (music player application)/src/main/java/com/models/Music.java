package com.models;

public class Music {
    private String name;
    private String artist;
    private String kindOfMusic;
    private String file;

    public Music() {
    }

    public Music(String tenBaiHat, String ngheSi, String theLoaiNhac, String file) {
        this.name = tenBaiHat;
        this.artist = ngheSi;
        this.kindOfMusic = theLoaiNhac;
        this.file = file;
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
