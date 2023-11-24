package com.example.covoiturage.Entities;

import jakarta.persistence.*;

import java.util.List;



    @Entity
    @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
    public abstract class Utilisateur {
    @Id
    @GeneratedValue (strategy = GenerationType.TABLE) //ligne modifier
    private Integer id;
    private String email;
    private String username;
    private String password;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;

    //1 utilisateur =>1 profile
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="profile_FK")
    private Profile profile;
    //1 utilisateur => plusieurs notifications
    @OneToMany(mappedBy = "utilisateur",
            fetch = FetchType.EAGER,//va chercher directement les notifications
            cascade = {CascadeType.ALL})
    private List<Notification> notifications;//il faut créer les getters et les setters
    //1 utilisateur => plusieurs notes
    @OneToMany(mappedBy = "utilisateur",
            fetch = FetchType.EAGER,//va chercher directement les notifications
            cascade = {CascadeType.ALL})
    private List<Note> notes;//il faut créer les getters et les setters

    public Utilisateur() {
    }

    public Utilisateur(String email, String username, String password, String nom, String prenom, String adresse, String telephone) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public Utilisateur(Integer id, String email, String username, String password, String nom, String prenom, String adresse, String telephone) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", profile=" + profile +
                '}';
    }
}
