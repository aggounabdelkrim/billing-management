package fr.adbi.invoice.controller;

import fr.adbi.common.entity.Invoice;
import fr.adbi.invoice.service.InvoiceService;
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
