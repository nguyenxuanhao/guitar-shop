package org.group02.guitarshop.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Set;

@Data
@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Person_Id", nullable = false)
    private int Person_Id;

    @Column(name = "Name", nullable = true, columnDefinition="nvarchar(255)")
    @NotEmpty(message = "*Vui lòng nhập tên")
    private String name;

    @Column(name = "Email", nullable = true, length = 255)
    @Email(message = "*Vui lòng nhập vào địa chỉ email hợp lệ")
    @NotEmpty(message = "*Vui lòng nhập email")
    private String email;

    @Column(name = "Password", nullable = true, length = 255)
    @Length(min = 5, message = "*Vui lòng nhập mật mã có ít nhất 5 ký tự")
    @NotEmpty(message = "*Vui lòng nhập mật mã")
    private String password;

    @Column(name = "Address", nullable = true, columnDefinition="nvarchar(1255)")
    private String address;

    @Column(name = "Phone", nullable = true, length = 20)
    private String phone;

    @Lob
    @Column(name = "Avatar", nullable = true)
    private String avatar;

    @Column(name = "Participation_Time", nullable = true)
    private Timestamp participationTime;

    @OneToMany(mappedBy = "personByIdPerson")
    private Collection<Invoice> invoicesById;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PERSON_ROLE", joinColumns = @JoinColumn(name = "Person_Id"), inverseJoinColumns = @JoinColumn(name = "Role_Id"))
    private Set<Role> roles;
}
