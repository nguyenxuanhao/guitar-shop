package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.util.Collection;
import lombok.Data;

@Data
@Entity
@Table(name = "CATEGORY")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Name", nullable = true, columnDefinition="nvarchar(255)")
    private String name;

    @Column(name = "Metadata", nullable = true, columnDefinition="nvarchar(50)")
    private String metadata;

    @OneToMany(mappedBy = "categoryByIdCategory")
    private Collection<Product> productsById;

}
