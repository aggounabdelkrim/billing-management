package fr.adbi.management.customer.service;

import fr.adbi.management.customer.repository.CustomerRepository;
import fr.adbi.management.model.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

}
