package vn.codegym.song.service.Impl;

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
