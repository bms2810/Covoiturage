package com.example.covoiturage.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passager extends Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Passager;
    private String review;

    public Passager() {
    }



    public Passager(Integer id, String email, String username, String password, String nom, String prénom, String adresse, String telephone, int id_Passager, String review) {
        super(id, email, username, password, nom, prénom, adresse, telephone);
        this.id_Passager = id_Passager;
        this.review = review;
    }

    public Passager(String email, String username, String password, String nom, String prénom, String adresse, String telephone, int id_Passager, String review) {
        super(email, username, password, nom, prénom, adresse, telephone);
        this.id_Passager = id_Passager;
        this.review = review;
    }

    public int getId_Passager() {
        return id_Passager;
    }

    public void setId_Passager(int id_Passager) {
        this.id_Passager = id_Passager;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "id_Passager=" + id_Passager +
                ", review='" + review + '\'' +
                '}';
    }
}
