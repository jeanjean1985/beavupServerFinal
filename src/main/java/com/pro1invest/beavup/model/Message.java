package com.pro1invest.beavup.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Message {
    private @Id
    @GeneratedValue
    Long id;
    private long senderID;
    private long receiverId;
    private String message;
    private Date sendingDate;
    private boolean readingStatus;

    public Message() {
    }

    public Message(long senderID, long receiverId, String message) {
        this.senderID = senderID;
        this.receiverId = receiverId;
        this.message = message;
        this.sendingDate = new Date();
        this.readingStatus = false;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getSenderID() {
        return senderID;
    }

    public void setSenderID(long senderID) {
        this.senderID = senderID;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(long receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(Date sendingDate) {
        this.sendingDate = sendingDate;
    }

    public boolean isReadingStatus() {
        return readingStatus;
    }

    public boolean getReadingStatus() {
        return this.readingStatus;
    }

    public void setReadingStatus(boolean readingStatus) {
        this.readingStatus = readingStatus;
    }
}

