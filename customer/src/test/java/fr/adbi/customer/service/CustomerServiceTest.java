package fr.adbi.customer.service;

import fr.adbi.common.entity.Customer;
import fr.adbi.customer.repository.CustomerRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;


@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {


    @Mock
    CustomerRepository customerRepository;


    @InjectMocks
    CustomerService customerService;


    @Test
    public void creer_client_par_son_id(){

        //GIVEN
        Customer client_to_create = Customer.builder()
                .nameCustomer("ADBI")
                .code("ADBI")
                .adress("paris")
                .build();

        Customer expectedClient =  Customer.builder()
                .id(1)
                .nameCustomer("ADBI")
                .code("ADBI")
                .adress("paris")
                .build();

        //WHEN


        Mockito.when(customerRepository.save(Mockito.any())).thenReturn(expectedClient);
        Customer result_client = customerService.create(client_to_create);

        System.out.println(client_to_create);
        System.out.println(result_client);

        //THEN
        Assert.assertEquals(result_client, expectedClient);

    }

}