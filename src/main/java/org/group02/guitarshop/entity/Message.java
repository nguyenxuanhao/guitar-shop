package org.group02.guitarshop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "MESSAGE")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Name", nullable = true, length = 50)
    private String name;

    @Column(name = "Email", nullable = true, length = 50)
    private String email;

    @Column(name = "Title", nullable = true, length = 255)
    private String title;

    @Column(name = "Message_Content", nullable = true, length = 1000)
    private String messageContent;

}
