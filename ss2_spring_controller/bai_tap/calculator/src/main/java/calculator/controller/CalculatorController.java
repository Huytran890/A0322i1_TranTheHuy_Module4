package calculator.controller;

import calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping("/")
    public String goHome() {
        return "home";
    }

    @PostMapping("/calculate")
    public String addition(@RequestParam double first, @RequestParam double second, String calculate, Model model) {
        model.addAttribute("result", this.calculatorService.calculate(first, second, calculate));
        return "home";
    }
}
