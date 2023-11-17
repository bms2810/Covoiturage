package com.example.covoiturage.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Conducteur extends Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Conducteur;
    private String review;
    private String permis_De_Conduire;

   // private Voiture voiture;

    public Conducteur() {
    }

    public Conducteur(Integer id, String email, String username, String password, String nom, String prénom, String adresse, String telephone, int id_Conducteur, String review, String permis_De_Conduire) {
        super(id, email, username, password, nom, prénom, adresse, telephone);
        this.id_Conducteur = id_Conducteur;
        this.review = review;
        this.permis_De_Conduire = permis_De_Conduire;
       // this.voiture = voiture;
    }

    public Conducteur(String email, String username, String password, String nom, String prénom, String adresse, String telephone, int id_Conducteur, String review, String permis_De_Conduire, Voiture voiture) {
        super(email, username, password, nom, prénom, adresse, telephone);
        this.id_Conducteur = id_Conducteur;
        this.review = review;
        this.permis_De_Conduire = permis_De_Conduire;
       // this.voiture = voiture;
    }

    public int getId_Conducteur() {
        return id_Conducteur;
    }

    public void setId_Conducteur(int id_Conducteur) {
        this.id_Conducteur = id_Conducteur;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getPermis_De_Conduire() {
        return permis_De_Conduire;
    }

    public void setPermis_De_Conduire(String permis_De_Conduire) {
        this.permis_De_Conduire = permis_De_Conduire;
    }

    @Override
    public String toString() {
        return "Conducteur{" +
                "id_Conducteur=" + id_Conducteur +
                ", review='" + review + '\'' +
                ", permis_De_Conduire='" + permis_De_Conduire + '\'' +
               // ", voiture=" + voiture +
                '}';
    }
}
