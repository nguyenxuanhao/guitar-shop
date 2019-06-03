package org.group02.guitarshop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ROLE")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Role_Id", nullable = false)
    private int roleId;

    @Column(name = "Role_Name", nullable = false, length = 50)
    private String roleName;

}
