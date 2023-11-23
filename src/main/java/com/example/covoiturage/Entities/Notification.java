package com.example.covoiturage.Entities;

import jakarta.persistence.*;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_notification;
    private String message;
    private String type_N;
    //Si on supprime une notification => on ne supprime pas l'utilisateur
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="id")
  private Utilisateur utilisateur;



    public Notification() {
    }

    public Notification(String message, String type_N) {
        this.message = message;
        this.type_N = type_N;
    }

    public Notification(int id_notification, String message, String type_N) {
        this.id_notification = id_notification;
        this.message = message;
        this.type_N = type_N;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id_notification=" + id_notification +
                ", message='" + message + '\'' +
                ", type_N='" + type_N + '\'' +
                ", utilisateur=" + utilisateur +
                '}';
    }
}
