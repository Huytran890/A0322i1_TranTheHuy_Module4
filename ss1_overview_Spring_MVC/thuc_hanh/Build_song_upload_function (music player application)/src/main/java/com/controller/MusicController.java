package com.controller;

import com.models.Music;
import com.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MusicController {
    @Autowired
    private MusicService musicService;

    @RequestMapping("/music")
    public String goAddMusic(Model model) {
        model.addAttribute("music", new Music());
        return "home";
    }

    @PostMapping("/add")
    public String addMusic(@ModelAttribute Music music, Model model) {
        musicService.save(music);
        List<Music> musicList = musicService.listAll();
        model.addAttribute("message", "Add new Success");
        model.addAttribute("musicList", musicList);
        return "/list";
    }
}
