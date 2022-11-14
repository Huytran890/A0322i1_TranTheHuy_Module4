package vn.codegym.song.repository;

public interface ISongRepository extends JpaRepository<Song, Integer> {
    Page<Song> findAll(Pageable pageable);
}
