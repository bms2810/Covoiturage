package com.example.covoiturage.Entities;

import jakarta.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_note;
    private int note;
    private String commentaire;
    //Si on supprime une note => on ne supprime pas l'utilisateur

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="utilisateur_id")
    private Utilisateur utilisateur;

    //Si on supprime une note => on ne supprime pas le trajet
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="trajet_id")//colonne de jointure (clé étrangère)
    private Trajet trajet;

    public Note() {
    }

    public Note(int id_note, int note, String commentaire) {
        this.id_note = id_note;
        this.note = note;
        this.commentaire = commentaire;
    }

    public Note(int note, String commentaire) {
        this.note = note;
        this.commentaire = commentaire;
    }

    public int getId_note() {
        return id_note;
    }

    public void setId_note(int id_note) {
        this.id_note = id_note;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id_note=" + id_note +
                ", note=" + note +
                ", commentaire='" + commentaire + '\'' +
                ", utilisateur=" + utilisateur +
                ", trajet=" + trajet +
                '}';
    }
}
