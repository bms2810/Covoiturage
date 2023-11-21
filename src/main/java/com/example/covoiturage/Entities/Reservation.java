package com.example.covoiturage.Entities;

import jakarta.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Reservation;
    private int nbre_Places_R;
    //Si on supprime une réservation => on ne supprime pas le trajet
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="trajet_id")//colonne de jointure (clé étrangère)
    private Trajet trajet;
    //Si on supprime une réservation => on ne supprime pas le passager
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="passager_id")//colonne de jointure (clé étrangère)
    private Passager passager;

    public Reservation() {
    }

    public Reservation(int id_Reservation, int nbre_Places_R) {
        this.id_Reservation = id_Reservation;
        this.nbre_Places_R = nbre_Places_R;
    }

    public Reservation(int nbre_Places_R) {
        this.nbre_Places_R = nbre_Places_R;
    }

    public int getId_Reservation() {
        return id_Reservation;
    }

    public void setId_Reservation(int id_Reservation) {
        this.id_Reservation = id_Reservation;
    }

    public int getNbre_Places_R() {
        return nbre_Places_R;
    }

    public void setNbre_Places_R(int nbre_Places_R) {
        this.nbre_Places_R = nbre_Places_R;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id_Reservation=" + id_Reservation +
                ", nbre_Places_R=" + nbre_Places_R +
                ", trajet=" + trajet +
                ", passager=" + passager +
                '}';
    }
}
