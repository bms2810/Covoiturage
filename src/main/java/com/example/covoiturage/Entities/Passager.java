package com.example.covoiturage.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Passager extends Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Passager;
    private String review;
    //1 passager => plusieurs réservations
    @OneToMany(mappedBy = "passager",
            fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Reservation> reservations;
    public Passager() {
    }

    public Passager(String email, String username, String password, String nom, String prenom, String adresse, String telephone, int id_Passager, String review) {
        super(email, username, password, nom, prenom, adresse, telephone);
        this.id_Passager = id_Passager;
        this.review = review;
    }

    public Passager(Integer id, String email, String username, String password, String nom, String prenom, String adresse, String telephone, int id_Passager, String review) {
        super(id, email, username, password, nom, prenom, adresse, telephone);
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

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "id_Passager=" + id_Passager +
                ", review='" + review + '\'' +
                ", reservations=" + reservations +
                '}';
    }
}
