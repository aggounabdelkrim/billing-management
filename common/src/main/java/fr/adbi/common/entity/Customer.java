package fr.adbi.common.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "customer", schema = "inv")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Customer implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String code;

    @Column(name = "name_customer", nullable = false, length = 255)
    private String nameCustomer;

    @Column(nullable = false, length = 255)
    private String adress;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Invoice> invoiceList;
}
