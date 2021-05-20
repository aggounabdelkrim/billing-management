package fr.adbi.common.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "invoice_line", schema = "inv")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@IdClass(InvoiceLineId.class)
public class InvoiceLine implements Serializable {

    @Id
    @Column(name = "id_invoice", nullable = false, insertable = false, updatable = false)
    private int idInvoice;

    @Id
    @Column(name = "id_item", nullable = false, insertable = false, updatable = false)
    private int idItem;

    @Column
    private double quantity;

    @Column(precision = 10, scale = 6)
    private BigDecimal price;


    @JoinColumn(name = "id_invoicee", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Invoice invoice;

    @JoinColumn(name = "id_item", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Item item;
}
