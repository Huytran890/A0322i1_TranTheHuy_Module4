package com.codegym.controller;

import com.codegym.model.AppMusic;
import com.codegym.service.IAppMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppMusicController {
    @Autowired
    private IAppMusicService appMusicService;

    @GetMapping("/list")
    public String goListSong(Model model) {
        model.addAttribute("music", appMusicService.listAll());

        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("music", new AppMusic());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute AppMusic appMusic) {
        this.appMusicService.create(appMusic);

        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        AppMusic appMusic = this.appMusicService.findById(id);
        this.appMusicService.delete(appMusic);

        return "redirect:/list";
    }

    @GetMapping("/edit")
    public String goUpdate(@RequestParam("id") int id, Model model) {
        model.addAttribute("music", appMusicService.findById(id));
        return "update";
    }

    @PostMapping("/edit")
    public String update(AppMusic appMusic) {
        appMusicService.edit(appMusic.getId(), appMusic);
        return "redirect:/list";
    }
}
