package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name="INVOICE")
public class Invoice {
    private int id;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String customerAddress;
    private String customerMessage;
    private Double total;
    private String paymentMethod;
    private Date createdTime;
    private Integer idUser;
    private Integer idDiscountCode;
    private User userByIdUser;
    private DiscountCode discountCodeByIdDiscountCode;
    private Collection<InvoiceDetail> invoiceDetailsById;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Customer_Name", nullable = true, length = 255)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "Customer_Email", nullable = true, length = 255)
    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Basic
    @Column(name = "Customer_Phone", nullable = true, length = 20)
    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Basic
    @Column(name = "Customer_Address", nullable = true, length = 1255)
    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Basic
    @Column(name = "Customer_Message", nullable = true, length = 1255)
    public String getCustomerMessage() {
        return customerMessage;
    }

    public void setCustomerMessage(String customerMessage) {
        this.customerMessage = customerMessage;
    }

    @Basic
    @Column(name = "Total", nullable = true)
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Basic
    @Column(name = "Payment_Method", nullable = true, length = 255)
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Basic
    @Column(name = "Created_Time", nullable = true)
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "Id_User", nullable = true)
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "Id_Discount_Code", nullable = true)
    public Integer getIdDiscountCode() {
        return idDiscountCode;
    }

    public void setIdDiscountCode(Integer idDiscountCode) {
        this.idDiscountCode = idDiscountCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return id == invoice.id &&
                Objects.equals(customerName, invoice.customerName) &&
                Objects.equals(customerEmail, invoice.customerEmail) &&
                Objects.equals(customerPhone, invoice.customerPhone) &&
                Objects.equals(customerAddress, invoice.customerAddress) &&
                Objects.equals(customerMessage, invoice.customerMessage) &&
                Objects.equals(total, invoice.total) &&
                Objects.equals(paymentMethod, invoice.paymentMethod) &&
                Objects.equals(createdTime, invoice.createdTime) &&
                Objects.equals(idUser, invoice.idUser) &&
                Objects.equals(idDiscountCode, invoice.idDiscountCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName, customerEmail, customerPhone, customerAddress, customerMessage, total, paymentMethod, createdTime, idUser, idDiscountCode);
    }

    @ManyToOne
    @JoinColumn(name = "Id_User", referencedColumnName = "Id", insertable = false, updatable = false)
    public User getUserByIdUser() {
        return userByIdUser;
    }

    public void setUserByIdUser(User userByIdUser) {
        this.userByIdUser = userByIdUser;
    }

    @ManyToOne
    @JoinColumn(name = "Id_Discount_Code", referencedColumnName = "Id", insertable = false, updatable = false)
    public DiscountCode getDiscountCodeByIdDiscountCode() {
        return discountCodeByIdDiscountCode;
    }

    public void setDiscountCodeByIdDiscountCode(DiscountCode discountCodeByIdDiscountCode) {
        this.discountCodeByIdDiscountCode = discountCodeByIdDiscountCode;
    }

    @OneToMany(mappedBy = "invoiceByIdInvoice")
    public Collection<InvoiceDetail> getInvoiceDetailsById() {
        return invoiceDetailsById;
    }

    public void setInvoiceDetailsById(Collection<InvoiceDetail> invoiceDetailsById) {
        this.invoiceDetailsById = invoiceDetailsById;
    }
}
