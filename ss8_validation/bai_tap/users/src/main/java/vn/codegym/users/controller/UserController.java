package vn.codegym.users.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.users.dto.UserDto;
import vn.codegym.users.model.User;
import vn.codegym.users.service.IUserService;

import java.awt.print.Pageable;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/list")
    public String goList(Model model,
                         @PageableDefault(value = 2) Pageable pageable) {
        model.addAttribute("user", this.iUserService.findAll(pageable));

        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("userDto", new UserDto());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated UserDto userDto,
                         BindingResult bindingResult) {
        new UserDto().validate(userDto, bindingResult);

        if (bindingResult.hasFieldErrors()){
            return "create";
        } else {
            User user = new User();
            BeanUtils.copyProperties(userDto, user);
            iUserService.create(user);
        }
        return "redirect:/list";
    }
}
