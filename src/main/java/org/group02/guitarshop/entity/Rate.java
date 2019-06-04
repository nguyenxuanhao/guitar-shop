package org.group02.guitarshop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "RATE")
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Number_Of_Stars", nullable = true, precision = 0)
    private Double numberOfStars;

    @Column(name = "Id_Product", nullable = true)
    private Integer idProduct;

    @ManyToOne
    @JoinColumn(name = "Id_Product", referencedColumnName = "Id", insertable = false, updatable = false)
    private Product productByIdProduct;

}
