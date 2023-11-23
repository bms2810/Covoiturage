package com.example.covoiturage.Entities;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Passager extends Utilisateur{

    private String review;
    //1 passager => plusieurs réservations
    @OneToMany(mappedBy = "passager",
            fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Reservation> reservations;
    public Passager() {
    }

    public Passager(Integer id, String email, String username, String password, String nom, String prenom, String adresse, String telephone, int id_Passager, String review, List<Reservation> reservations) {
        super(id, email, username, password, nom, prenom, adresse, telephone);
        this.review = review;
        this.reservations = reservations;
    }

    public Passager(Integer id, String email, String username, String password, String nom, String prenom, String adresse, String telephone, String review, List<Reservation> reservations) {
        super(id, email, username, password, nom, prenom, adresse, telephone);
        this.review = review;
        this.reservations = reservations;
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
                ", review='" + review + '\'' +
                ", reservations=" + reservations +
                '}';
    }
}
