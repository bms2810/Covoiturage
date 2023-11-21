package com.example.covoiturage.Entities;

import jakarta.persistence.*;

@Entity
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_voiture;
    private String immatriculation;
    private String modele;
    private String marque;
    private String couleur;
    private int annee;
    //Si on supprime une voiture => on ne supprime pas le conducteur
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="conducteur_id")//colonne de jointure (clé étrangère)
    private Conducteur conducteur;

    public Voiture() {
    }

    public Voiture(int id_voiture, String immatriculation, String modele, String marque, String couleur, int annee) {
        this.id_voiture = id_voiture;
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.marque = marque;
        this.couleur = couleur;
        this.annee = annee;
    }

    public Voiture(String immatriculation, String modele, String marque, String couleur, int annee) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.marque = marque;
        this.couleur = couleur;
        this.annee = annee;
    }

    public int getId_voiture() {
        return id_voiture;
    }

    public void setId_voiture(int id_voiture) {
        this.id_voiture = id_voiture;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "id_voiture=" + id_voiture +
                ", immatriculation='" + immatriculation + '\'' +
                ", modele='" + modele + '\'' +
                ", marque='" + marque + '\'' +
                ", couleur='" + couleur + '\'' +
                ", annee=" + annee +
                ", conducteur=" + conducteur +
                '}';
    }
}
