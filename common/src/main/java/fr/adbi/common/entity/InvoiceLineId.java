package fr.adbi.common.entity;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class InvoiceLineId implements Serializable {
    private int idInvoice;
    private int idItel;
}
