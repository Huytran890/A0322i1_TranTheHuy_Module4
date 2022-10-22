package calculator.controller;

import calculator.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ChangingMoney {

    @Autowired
    private MoneyService moneyService;

    @GetMapping()
    public String index(){
        return "money";
    }

    @PostMapping("/convert")
    public String convert(@PathVariable Double usd,
                          @PathVariable Double rate, Model model) {
        model.addAttribute("result", this.moneyService.convert(usd, rate));
        return "result_final";
    }
}
