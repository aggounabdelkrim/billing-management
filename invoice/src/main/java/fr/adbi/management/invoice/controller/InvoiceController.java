package fr.adbi.management.invoice.controller;

import fr.adbi.management.invoice.service.InvoiceService;
import fr.adbi.management.model.entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;


    @PostMapping(path = "/api/facture/")
    public Invoice hello(Invoice invoice){
        return invoiceService.create(invoice);
    }
}
