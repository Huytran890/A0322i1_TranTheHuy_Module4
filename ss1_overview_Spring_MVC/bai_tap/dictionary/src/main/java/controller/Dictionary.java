package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryService;

@Controller
public class Dictionary {
    @Autowired
    private DictionaryService dictionnaryService;

    @GetMapping("/")
    public String goDictionary() {
        return "dictionary";
    }

    @PostMapping(value = "/translate")
    public String convert(@RequestParam String english, Model model) {
        String result = dictionnaryService.translate(english);
        model.addAttribute("vietnamese", result);
        return "dictionary";

    }
}
