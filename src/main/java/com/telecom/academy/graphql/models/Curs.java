package com.telecom.academy.graphql.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Curs implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue
    private int id;

    @Column(name = "titlu", nullable = false)
    private String titlu;

    @Column(name = "descriere", nullable = false)
    private String descriere;

    @Column(name = "autor", nullable = false)
    private String autor;

    public Curs() {
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
