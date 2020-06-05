package com.pro1invest.beavup.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Commentaire {
    private @Id
    @GeneratedValue
    Long id;
    private long postID;
    private long userId;
    private String comment;

    public Commentaire() {
    }

    public Commentaire(long postID, long userId, String comment) {
        this.postID = postID;
        this.userId = userId;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public long getPostID() {
        return postID;
    }

    public void setPostID(long postID) {
        this.postID = postID;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
