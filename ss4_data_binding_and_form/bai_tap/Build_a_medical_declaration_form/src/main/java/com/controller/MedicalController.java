package com.controller;

import com.models.Medical;
import com.service.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MedicalController {
    @Autowired
    private MedicalService medicalService;

    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/home", "form", new Medical());
        return modelAndView;
    }

    @PostMapping("/send")
    public String send(@ModelAttribute("form") Medical medical, Model model) {
        medicalService.addNewForm(medical);
        List<Medical> medicalList = medicalService.showList();
        model.addAttribute("message", "Đã gửi thành công");
        model.addAttribute("medicalList", medicalList);
        return "/list";
    }
}
