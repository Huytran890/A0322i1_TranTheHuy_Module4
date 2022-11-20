package vn.codegym.song.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import vn.codegym.song.model.Song;
import vn.codegym.song.repository.ISongRepository;
import vn.codegym.song.service.ISongService;

import java.awt.print.Pageable;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository songRepository;

    @Override
    public Page<Song> findAll(Pageable pageable) {
        return this.songRepository.findAll(pageable);
    }

    @Override
    public void save(Song song) {
        this.songRepository.save(song);
    }

    @Override
    public Song findById(int id) {
        return this.songRepository.findById(id).orElse(null);
    }
}
