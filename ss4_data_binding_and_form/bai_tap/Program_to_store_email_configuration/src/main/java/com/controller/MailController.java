package com.controller;

import com.models.Mail;
import com.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MailController {
    @Autowired
    private MailService mailService;

    @GetMapping("/mail")
    public String home(Model model) {
        List<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Vietnamese");
        languages.add("Japanese");
        languages.add("Chinese");
        List<String> pageSize = new ArrayList<>();
        pageSize.add("5");
        pageSize.add("10");
        pageSize.add("15");
        pageSize.add("20");
        pageSize.add("25");
        pageSize.add("50");
        pageSize.add("100");
        model.addAttribute("languages", languages);
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("mail", new Mail());
        return "home";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("mail") Mail mail, Model model) {
        mailService.addNewForm(mail);
        List<Mail> mailList = mailService.showList();
        model.addAttribute("message", "Thêm mới thành công");
        model.addAttribute("mailList", mailList);
        return "list";
    }
}
