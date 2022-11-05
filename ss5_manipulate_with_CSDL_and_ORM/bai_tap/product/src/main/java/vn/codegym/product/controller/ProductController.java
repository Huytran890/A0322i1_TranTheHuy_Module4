package vn.codegym.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.codegym.product.model.Product;
import vn.codegym.product.service.ICategoryService;
import vn.codegym.product.service.IProductService;

import java.awt.print.Pageable;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public String goListProduct(Model model,
                                @PageableDefault(value = 3) Pageable pageable,
                                @RequestParam Optional<String> name,
                                @RequestParam Optional<String> description,
                                @RequestParam Optional<String> manufacture) {
        String nameVal = name.orElse("");
        String descriptionVal = description.orElse("");
        String manufactureVal = manufacture.orElse("");


        model.addAttribute("product",
                this.productService.findAllAndSearch(nameVal, descriptionVal, manufactureVal, pageable));
        model.addAttribute("nameVal", nameVal);
        model.addAttribute("descriptionVal", descriptionVal);
        model.addAttribute("manufactureVal", manufactureVal);


        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("category", this.categoryService.findAll());
        model.addAttribute("product", new Product());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product) {
        this.productService.save(product);

        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        this.productService.deleteById(id);

        return "redirect:/list";
    }

    @GetMapping("/edit")
    public String goUpdate(@RequestParam("id") int id, Model model) {
        model.addAttribute("category", this.categoryService.findAll());
        model.addAttribute("product", this.productService.findById(id));
        return "update";
    }

    @PostMapping("/edit")
    public String update(Product product) {
        productService.save(product);
        return "redirect:/list";
    }
}
