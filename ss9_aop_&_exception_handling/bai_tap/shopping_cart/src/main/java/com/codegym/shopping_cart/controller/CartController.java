package com.codegym.shopping_cart.controller;

import com.codegym.shopping_cart.dto.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cart")
public class CartController {
    @RequestMapping
    public ModelAndView showCart(@SessionAttribute(name = "cart", required = false) CartDto cartDto){
        return new ModelAndView("cart","cart",cartDto);
    }
}
