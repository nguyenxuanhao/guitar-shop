package org.group02.guitarshop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="ADMIN")
public class Admin {
    private int id;
    private String name;
    private String username;
    private String password;
    private String avatar;

    @Id
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
    @Column(name = "Username", nullable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    @Column(name = "Avatar", nullable = true, length = 2147483647)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return id == admin.id &&
                Objects.equals(name, admin.name) &&
                Objects.equals(username, admin.username) &&
                Objects.equals(password, admin.password) &&
                Objects.equals(avatar, admin.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, password, avatar);
    }
}
