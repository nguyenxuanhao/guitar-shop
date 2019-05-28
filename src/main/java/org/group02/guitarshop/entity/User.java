package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "USER", schema = "dbo", catalog = "GUITARSHOP")
public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String avatar;
    private Date participationTime;
    private Collection<Invoice> invoicesById;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Password", nullable = true, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Phone", nullable = true, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "Avatar", nullable = true, length = 2147483647)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "Participation_Time", nullable = true)
    public Date getParticipationTime() {
        return participationTime;
    }

    public void setParticipationTime(Date participationTime) {
        this.participationTime = participationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(address, user.address) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(avatar, user.avatar) &&
                Objects.equals(participationTime, user.participationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, address, phone, avatar, participationTime);
    }

    @OneToMany(mappedBy = "userByIdUser")
    public Collection<Invoice> getInvoicesById() {
        return invoicesById;
    }

    public void setInvoicesById(Collection<Invoice> invoicesById) {
        this.invoicesById = invoicesById;
    }
}
