package com.controller;

@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/list")
    public String listAll(Model model){
        model.addAttribute("product", iProductService.listAll());

        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("product", new Product());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product) {
        this.iProductService.create(product);

        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        Product product = this.iProductService.findById(id);
        this.iProductService.delete(product);

        return "redirect:/list";
    }

    @GetMapping("/edit")
    public String goUpdate(@RequestParam("id") int id, Model model) {
        model.addAttribute("product", this.iProductService.findById(id));
        return "update";
    }

    @PostMapping("/edit")
    public String update(Product product) {
        iProductService.edit(product.getId(), product);
        return "redirect:/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam("name") String name, Model model){
        model.addAttribute("product", iProductService.search(name));

        return "/list";
    }
}
