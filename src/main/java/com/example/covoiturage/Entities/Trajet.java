package com.example.covoiturage.Entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Trajet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_trajet;
    private int nbre_Places_D;
    private double prix_course;
    private String ville_depart;
    private String ville_arrivee;
    private Date date_Heure_Depart; //format(AAAA/MM/DD HH:MM)
    //1 trajet => plusieurs notes
    @OneToMany(mappedBy = "trajet",
            fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Note> notes;
    //1 trajet => plusieurs réservations
    @OneToMany(mappedBy = "trajet",
            fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Reservation> reservations;
    //Si on supprime un trajet => on ne supprime pas le conducteur
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="conducteur_id")//colonne de jointure (clé étrangère)
    private Conducteur conducteur;

    public Trajet() {
    }

    public Trajet(int id_trajet, int nbre_Places_D, double prix_course, String ville_depart, String ville_arrivee, Date date_Heure_Depart) {
        this.id_trajet = id_trajet;
        this.nbre_Places_D = nbre_Places_D;
        this.prix_course = prix_course;
        this.ville_depart = ville_depart;
        this.ville_arrivee = ville_arrivee;
        this.date_Heure_Depart = date_Heure_Depart;
    }

    public Trajet(int nbre_Places_D, double prix_course, String ville_depart, String ville_arrivee, Date date_Heure_Depart) {
        this.nbre_Places_D = nbre_Places_D;
        this.prix_course = prix_course;
        this.ville_depart = ville_depart;
        this.ville_arrivee = ville_arrivee;
        this.date_Heure_Depart = date_Heure_Depart;
    }

    public int getId_trajet() {
        return id_trajet;
    }

    public void setId_trajet(int id_trajet) {
        this.id_trajet = id_trajet;
    }

    public int getNbre_Places_D() {
        return nbre_Places_D;
    }

    public void setNbre_Places_D(int nbre_Places_D) {
        this.nbre_Places_D = nbre_Places_D;
    }

    public double getPrix_course() {
        return prix_course;
    }

    public void setPrix_course(double prix_course) {
        this.prix_course = prix_course;
    }

    public String getVille_depart() {
        return ville_depart;
    }

    public void setVille_depart(String ville_depart) {
        this.ville_depart = ville_depart;
    }

    public String getVille_arrivee() {
        return ville_arrivee;
    }

    public void setVille_arrivee(String ville_arrivee) {
        this.ville_arrivee = ville_arrivee;
    }

    public Date getDate_Heure_Depart() {
        return date_Heure_Depart;
    }

    public void setDate_Heure_Depart(Date date_Heure_Depart) {
        this.date_Heure_Depart = date_Heure_Depart;
    }

    @Override
    public String toString() {
        return "Trajet{" +
                "id_trajet=" + id_trajet +
                ", nbre_Places_D=" + nbre_Places_D +
                ", prix_course=" + prix_course +
                ", ville_depart='" + ville_depart + '\'' +
                ", ville_arrivee='" + ville_arrivee + '\'' +
                ", date_Heure_Depart=" + date_Heure_Depart +
                ", notes=" + notes +
                ", reservations=" + reservations +
                ", conducteur=" + conducteur +
                '}';
    }
}
