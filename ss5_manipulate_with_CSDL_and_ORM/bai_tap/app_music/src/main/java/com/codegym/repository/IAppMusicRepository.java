package com.codegym.repository;

import com.codegym.model.AppMusic;

import java.util.List;

public interface IAppMusicRepository {
    List<AppMusic> listAll();

    AppMusic findById(int id);

    void create(AppMusic appMusic);

    void edit(int id, AppMusic appMusic);

    void delete(AppMusic appMusic);
}
