package com.codegym.service.Impl;

import com.codegym.model.AppMusic;
import com.codegym.repository.IAppMusicRepository;
import com.codegym.service.IAppMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppMusicService implements IAppMusicService {
    @Autowired
    private IAppMusicRepository appMusicRepository;

    @Override
    public List<AppMusic> listAll() {
        return this.appMusicRepository.listAll();
    }

    @Override
    public AppMusic findById(int id) {
        return this.appMusicRepository.findById(id);
    }

    @Override
    public void create(AppMusic appMusic) {
        this.appMusicRepository.create(appMusic);
    }

    @Override
    public void edit(int id, AppMusic appMusic) {
        this.appMusicRepository.edit(id, appMusic);
    }

    @Override
    public void delete(AppMusic appMusic) {
        this.appMusicRepository.delete(appMusic);
    }
}
