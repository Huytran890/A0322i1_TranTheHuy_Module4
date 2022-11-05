package com.controller;

import com.models.Music;
import com.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MusicController {
    @Autowired
    private IMusicService musicService;

    @GetMapping("/musics")
    public String list(Model model) {

        model.addAttribute("musics", this.musicService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Music music, RedirectAttributes redirectAttributes) {
        this.musicService.save(music);
        redirectAttributes.addFlashAttribute("messages","successfully added new");
        return "redirect:/musics";
    }
//    @GetMapping("/{id}/delete")
//    public String delete(@PathVariable int id, Model model) {
//        model.addAttribute("music", musicService.findById(id));
//        return "/list";
//    }

    @GetMapping("/delete")
    public String delete(@RequestParam Integer id, RedirectAttributes redirectAttributes){
        Music music=this.musicService.findById(id);
        this.musicService.remove(music);
        redirectAttributes.addFlashAttribute("messages","successful delete");
        return "redirect:/musics";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("music", musicService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Music music,RedirectAttributes redirectAttributes) {
        musicService.update(music);
        redirectAttributes.addFlashAttribute("messages", "Update successful");
        return "redirect:/musics";
    }

}
