package fr.adbi.management.customer.service;

import fr.adbi.management.customer.repository.CustomerRepository;
import fr.adbi.management.model.entity.Customer;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @Mock
    CustomerRepository customerRepository;

    @InjectMocks
    CustomerService customerService;

    @Test
    public void createrCustomerById() {
        //GIVEN
        Customer customerToCreate = Customer.builder()
                .nameCustomer("ADBI")
                .code("ADBI")
                .adress("paris")
                .build();

        Customer expectedCustomer = Customer.builder()
                .id(1)
                .nameCustomer("ADBI")
                .code("ADBI")
                .adress("paris")
                .build();

        //WHEN
        Mockito.when(customerRepository.save(Mockito.any())).thenReturn(expectedCustomer);
        Customer resultCustomer = customerService.create(customerToCreate);

        System.out.println(customerToCreate.toString());
        System.out.println(resultCustomer.toString());

        //THEN
        Assert.assertEquals(resultCustomer, expectedCustomer);
    }

}
