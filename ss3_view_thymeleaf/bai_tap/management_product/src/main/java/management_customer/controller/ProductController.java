package management_customer.controller;

import management_customer.models.Product;
import management_customer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/list")
    public String goListProduct(Model model) {
        model.addAttribute("product", this.productService.productAll());

        return "list";
    }

    @GetMapping(value = "/create")
    public String goCreateProduct(Model model) {
        model.addAttribute("product", new Product());

        return "create";
    }

    @PostMapping(value = "/create")
    public String createProduct(@ModelAttribute Product product) {
        this.productService.create(product);

        return "redirect:/list";
    }

    @GetMapping(value = "/delete")
    public String delete(@RequestParam("id") int id) {
        this.productService.delete(id);

        return "redirect:/list";
    }

    @GetMapping("/{id}/update")
    public String goUpdate(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(Product product) {
        productService.edit(product.getId(), product);
        return "redirect:/list";
    }

    @GetMapping("{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("productList", productService.findById(id));

        return "/view";
    }

    @GetMapping("/search")
    public String search(@RequestParam("name") String name, Model model) {
        model.addAttribute("product", productService.search(name));

        return "/list";
    }
}
