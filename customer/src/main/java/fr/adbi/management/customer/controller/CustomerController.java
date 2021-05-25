package fr.adbi.management.customer.controller;

import fr.adbi.management.customer.service.CustomerService;
import fr.adbi.management.model.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @PostMapping(path = "/api/client/")
    public Customer hello(Customer customer){
        return customerService.create(customer);
    }
}
