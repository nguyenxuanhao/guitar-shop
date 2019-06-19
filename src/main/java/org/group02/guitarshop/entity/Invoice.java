package org.group02.guitarshop.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Data
@Entity
@Table(name = "INVOICE")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Customer_Name", nullable = true, columnDefinition="nvarchar(255)")
    private String customerName;

    @Column(name = "Customer_Email", nullable = true, length = 255)
    private String customerEmail;

    @Column(name = "Customer_Phone", nullable = true, length = 20)
    private String customerPhone;

    @Column(name = "Customer_Address", nullable = true, columnDefinition="nvarchar(1255)")
    private String customerAddress;

    @Column(name = "Customer_Message", nullable = true, columnDefinition="nvarchar(1255)")
    private String customerMessage;

    @Column(name = "Total", nullable = true)
    private Double total;

    @Column(name = "Payment_Method", nullable = true, columnDefinition="nvarchar(255)")
    private String paymentMethod;

    @Column(name = "Created_Time", nullable = true)
    private Timestamp createdTime;

    @Column(name = "Id_Person", nullable = true)
    private Integer idPerson;

    @Column(name = "Id_Discount_Code", nullable = true)
    private Integer idDiscountCode;

    @Column(name = "Status", nullable = true)
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "Id_Discount_Code", referencedColumnName = "Id", insertable = false, updatable = false)
    private DiscountCode discountCodeByIdDiscountCode;

    @OneToMany(mappedBy = "invoiceByIdInvoice")
    private Collection<InvoiceDetail> invoiceDetailsById;
}
