package vn.codegym.song.service;

public interface ISongService {
    Page<Song> findAll(Pageable pageable);

    void save(Song song);

    Song findById(int id);
}
