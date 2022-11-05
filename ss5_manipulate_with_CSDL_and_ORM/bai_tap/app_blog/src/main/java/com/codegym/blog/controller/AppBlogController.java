package com.codegym.blog.controller;

import com.codegym.blog.model.AppBlog;
import com.codegym.blog.service.IAppBlogService;
import com.codegym.blog.service.IBlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppBlogController {
    @Autowired
    private IAppBlogService appBlogService;

    @Autowired
    private IBlogTypeService blogTypeService;

    @GetMapping("/list")
    public String goListBlog(Model model) {
        model.addAttribute("typeBlog", this.blogTypeService.findAll());
        model.addAttribute("blog", this.appBlogService.findAll());

        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("typeBlog", this.blogTypeService.findAll());
        model.addAttribute("blog", new AppBlog());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute AppBlog appMusic) {
        this.appBlogService.save(appMusic);

        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        this.appBlogService.deleteById(id);

        return "redirect:/list";
    }

    @GetMapping("/edit")
    public String goUpdate(@RequestParam("id") int id, Model model) {
        model.addAttribute("typeBlog", this.blogTypeService.findAll());
        model.addAttribute("blog", this.appBlogService.findById(id));
        return "update";
    }

    @PostMapping("/edit")
    public String update(AppBlog appBlog) {
        appBlogService.save(appBlog);
        return "redirect:/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam("name") String name, Model model) {
        model.addAttribute("blog", this.appBlogService.listSearch(name));
        return "/list";
    }

}