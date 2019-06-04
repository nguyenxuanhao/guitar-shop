package org.group02.guitarshop.models;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("session")
public class PersonalInfomation {
    public String name;
    public String phone;
    public String email;
    public String address;

    public PersonalInfomation() {
        this.name = "";
        this.phone = "";
        this.email = "";
        this.address = "";
    }
    public PersonalInfomation(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}