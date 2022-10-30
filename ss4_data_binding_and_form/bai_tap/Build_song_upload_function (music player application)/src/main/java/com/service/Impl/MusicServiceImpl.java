package com.service.Impl;

import com.models.Music;
import com.service.MusicService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    private static List<Music> musicList=new ArrayList<>();
    static {

        musicList.add(new Music("Đổi thay","Hồ Quang Hiếu","Nhạc trẻ","abc"));
    }

    @Override
    public List<Music> listAll() {
        return musicList;
    }

    @Override
    public void save(Music music) {
        musicList.add(music);
    }
}
