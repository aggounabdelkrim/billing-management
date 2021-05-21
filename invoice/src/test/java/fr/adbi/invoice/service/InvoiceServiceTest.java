package fr.adbi.invoice.service;

import fr.adbi.common.entity.Customer;
import fr.adbi.common.entity.Invoice;
import fr.adbi.invoice.repository.InvoiceRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class InvoiceServiceTest {

    @Mock
    InvoiceRepository invoiceRepository;

    @InjectMocks
    InvoiceService invoiceService;

    @Test
    public void create_invoice_by_id() {
        Customer customer = Customer.builder()
                .id(1)
                .nameCustomer("ADBI")
                .code("ADBI")
                .adress("paris")
                .build();

        //GIVEN
        Invoice invoiceToCreate = Invoice.builder()
                .customer(customer)
                .numberInvoice("Inv0001")
                .descrition("Facture 0001")
                .build();

        Invoice expectedInvoice = Invoice.builder()
                .id(1)
                .customer(customer)
                .numberInvoice("Inv0001")
                .descrition("Facture 0001")
                .build();

        //WHEN
        Mockito.when(invoiceRepository.save(Mockito.any())).thenReturn(expectedInvoice);
        Invoice resultInvoice = invoiceService.create(invoiceToCreate);

        //THEN
        Assert.assertEquals(resultInvoice, expectedInvoice);
    }

}
