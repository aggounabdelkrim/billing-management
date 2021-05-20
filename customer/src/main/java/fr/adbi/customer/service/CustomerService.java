package fr.adbi.customer.service;

import fr.adbi.common.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adbi.customer.repository.CustomerRepository;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

}
