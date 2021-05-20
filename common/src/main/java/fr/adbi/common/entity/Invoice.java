package fr.adbi.common.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "invoice", schema = "inv")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Invoice implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;

    @Column(name = "number_invoice", nullable = false, length = 10)
    private String numberInvoice;

    @Column(nullable = false, length = 255)
    private String descrition;

    @Column(name = "total_ht", nullable = false, precision = 10, scale = 6)
    private BigDecimal totalHt;

    @Column(name = "rate_avt", nullable = false)
    private Double rateAvt;

    @Column(name = "avt", nullable = false, precision = 10, scale = 6)
    private BigDecimal avt;

    @Column(name = "total_ttc", nullable = false, precision = 10, scale = 6)
    private BigDecimal totalTtc;


    @JoinColumn(name = "id_customer", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;
}
