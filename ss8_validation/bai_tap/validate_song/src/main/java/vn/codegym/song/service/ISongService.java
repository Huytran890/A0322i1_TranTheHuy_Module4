package vn.codegym.song.service;

import org.springframework.data.domain.Page;
import vn.codegym.song.model.Song;

import java.awt.print.Pageable;

public interface ISongService {
    Page<Song> findAll(Pageable pageable);

    void save(Song song);

    Song findById(int id);
}
