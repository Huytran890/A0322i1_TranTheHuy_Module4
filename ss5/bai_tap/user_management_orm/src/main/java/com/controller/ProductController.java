package com.controller;

@Controller
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping("/list")
    public String listAll(Model model){
        model.addAttribute("product", iProductService.productAll());

        return "list";
    }
}
