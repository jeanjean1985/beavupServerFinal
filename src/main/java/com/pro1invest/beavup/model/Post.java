package com.pro1invest.beavup.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Post {

    private @Id
    @GeneratedValue
    Long id;
    private long userId;
    private String descr;
    private String location;
    private int typeOfPost;
    private int status;


    public Post() {
    }


    public Post(long userId, String descr, String location, int typeOfPost, int status) {
        this.userId = userId;
        this.descr = descr;
        this.location = location;
        this.typeOfPost = typeOfPost;
        this.status = status;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTypeOfPost() {
        return typeOfPost;
    }

    public void setTypeOfPost(int typeOfPost) {
        this.typeOfPost = typeOfPost;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

