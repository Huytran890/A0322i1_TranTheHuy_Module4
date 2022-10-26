package com.service;

import com.models.Music;

import java.util.List;

public interface MusicService {
    List<Music> listAll();

    void save(Music music);
}
