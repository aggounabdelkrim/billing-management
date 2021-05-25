package fr.adbi.management.invoice.service;

import fr.adbi.management.invoice.repository.InvoiceRepository;
import fr.adbi.management.model.entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    public Invoice create(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

}
