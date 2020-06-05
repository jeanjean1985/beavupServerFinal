package com.pro1invest.beavup.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Avis {
    long userId;
    long avisId;

    int rating;
    String comment;
    private @Id
    @GeneratedValue
    long id;

    Avis() {
    }

    public Avis(long userId, long avisId, int rating, String comment) {
        this.userId = userId;
        this.avisId = avisId;

        this.rating = rating;
        this.comment = comment;

    }

}
