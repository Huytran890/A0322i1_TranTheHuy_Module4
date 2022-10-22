package customer.controller;

import customer.models.Customer;
import customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @GetMapping()
    public ModelAndView showList() {
        List<Customer> customerList = customerService.findAll();
        return new ModelAndView( "list", "customerList", customerList);
    }

}
