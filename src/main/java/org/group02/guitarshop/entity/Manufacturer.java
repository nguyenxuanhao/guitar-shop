package org.group02.guitarshop.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "MANUFACTURER")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Name", nullable = true, columnDefinition="nvarchar(255)")
    private String name;

    @Column(name = "Country", nullable = true, columnDefinition="nvarchar(255)")
    private String country;

    @OneToMany(mappedBy = "manufacturerByIdManufacturer")
    private Collection<Product> productsById;

}
