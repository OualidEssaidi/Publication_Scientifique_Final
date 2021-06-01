package com.ucd.Publication.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "publication")
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String type;
    private String title;
    private String publicher;
    private long annee;
    private String URL_ISBN;
    private String volume;
    private String maison_edit;
    private String ifact;
    private String Q;

    public Publication() { }

    public Publication(String type, String title, String publicher, long annee, String URL_ISBN, String volume, String maisonEdit, String ifact, String q) {
        this.type = type;
        this.title = title;
        this.publicher = publicher;
        this.annee = annee;
        this.URL_ISBN = URL_ISBN;
        this.volume = volume;
        this.maison_edit = maisonEdit;
        this.ifact = ifact;
        this.Q = q;
    }
}
