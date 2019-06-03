package org.group02.guitarshop.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ADMIN")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Name", nullable = true, length = 255)
    private String name;

    @Column(name = "Username", nullable = true, length = 255)
    private String username;

    @Column(name = "Password", nullable = true, length = 255)
    private String password;

    @Column(name = "Avatar", nullable = true)
    private String avatar;

}
