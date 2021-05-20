package fr.adbi.common.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "item", schema = "inv")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String code;

    @Column(nullable = false, length = 255)
    private String description;

    @Column(name = "unit_measure", nullable = false, length = 255)
    private String unitMeasure;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item", fetch = FetchType.LAZY)
    private List<InvoiceLine> invoiceLineList;
}
