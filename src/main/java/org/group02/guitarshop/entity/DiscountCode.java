package org.group02.guitarshop.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Data
@Entity
@Table(name = "DISCOUNT_CODE")
public class DiscountCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Code", nullable = true, length = 255)
    private String code;

    @Column(name = "Discount_Amount", nullable = true)
    private Integer discountAmount;

    @Column(name = "Start_Date", nullable = true)
    private Timestamp startDate;

    @Column(name = "End_Date", nullable = true)
    private Timestamp endDate;

    @OneToMany(mappedBy = "discountCodeByIdDiscountCode")
    private Collection<Invoice> invoicesById;
}
