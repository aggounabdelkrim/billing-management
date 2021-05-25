package fr.adbi.management.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
