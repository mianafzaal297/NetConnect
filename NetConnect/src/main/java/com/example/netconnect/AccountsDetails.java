package com.example.netconnect;

import java.io.Serializable;

public class AccountsDetails implements Serializable {
    public String name;
    public String username;
    public String email;
    public String phone;
    public String DoB;
    public String merital;
    public String gender;
    public String address;
    public String natinality;
    public String password;


    public AccountsDetails(String name, String username, String email, String phone, String doB, String merital, String gender, String address, String natinality, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        DoB = doB;
        this.merital = merital;
        this.gender = gender;
        this.address = address;
        this.natinality = natinality;
        this.password = password;
    }

    public AccountsDetails() {
    }

    @Override
    public String toString() {
        return "AccountsDetails{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", DoB='" + DoB + '\'' +
                ", merital='" + merital + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", natinality='" + natinality + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
