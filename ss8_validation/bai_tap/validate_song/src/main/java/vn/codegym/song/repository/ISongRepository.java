package vn.codegym.song.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.song.model.Song;

import java.awt.print.Pageable;

public interface ISongRepository extends JpaRepository<Song, Integer> {
    Page<Song> findAll(Pageable pageable);
}
