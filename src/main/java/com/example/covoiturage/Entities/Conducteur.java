package com.example.covoiturage.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Conducteur extends Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Conducteur;
    private String review;
    private String permis_De_Conduire;
    //1 conducteur => plusieurs voitures
    @OneToMany(mappedBy = "conducteur",
            fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Voiture> voitures;//il faut créer les getters et les setters
    //1 conducteur => plusieurs trajets
    @OneToMany(mappedBy = "conducteur",
            fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Trajet> trajets;//il faut créer les getters et les setters


    public Conducteur() {
    }

    public Conducteur(String email, String username, String password, String nom, String prenom, String adresse, String telephone, int id_Conducteur, String review, String permis_De_Conduire) {
        super(email, username, password, nom, prenom, adresse, telephone);
        this.id_Conducteur = id_Conducteur;
        this.review = review;
        this.permis_De_Conduire = permis_De_Conduire;
    }

    public Conducteur(Integer id, String email, String username, String password, String nom, String prenom, String adresse, String telephone, int id_Conducteur, String review, String permis_De_Conduire) {
        super(id, email, username, password, nom, prenom, adresse, telephone);
        this.id_Conducteur = id_Conducteur;
        this.review = review;
        this.permis_De_Conduire = permis_De_Conduire;
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
                ", voitures=" + voitures +
                ", trajets=" + trajets +
                '}';
    }
}
