package com.pro1invest.beavup.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String descr;
    private String mail;
    private String password;
    private String logo;
    private int typeOfUser;


    private String adress;
    private String phone;

    public User() {
    }

    public User(String name, String descr, String mail, String logo, int typeOfUser, String adress) {
        this.name = name;
        this.descr = descr;
        this.mail = mail;
        this.logo = logo;

        this.typeOfUser = typeOfUser;

        this.adress = adress;
    }

    public User(String name, String descr, String mail, String logo, int typeOfUser) {
        this.name = name;
        this.descr = descr;
        this.mail = mail;
        this.logo = logo;
        this.typeOfUser = typeOfUser;
    }

    public User(String name, String descr, String password, String mail, String logo, int typeOfUser) {
        this.name = name;
        this.descr = descr;
        this.mail = mail;
        this.logo = logo;
        this.typeOfUser = typeOfUser;
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(int typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}