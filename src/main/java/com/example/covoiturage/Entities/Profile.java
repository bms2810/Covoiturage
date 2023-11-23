package com.example.covoiturage.Entities;

import jakarta.persistence.*;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Profile;
    private int age;
    private String sexe;
    private String description;
    private boolean accepter_animal;
    private boolean accepter_fumeurs;
    @OneToOne(mappedBy = "profile",
            cascade = { CascadeType.ALL})

    private Utilisateur utilisateur;


    public Profile() {
    }


    public Profile(int id_Profile, int age, String sexe, String description, boolean accepter_animal, boolean accepter_fumeurs) {
        this.id_Profile = id_Profile;
        this.age = age;
        this.sexe = sexe;
        this.description = description;
        this.accepter_animal = accepter_animal;
        this.accepter_fumeurs = accepter_fumeurs;
    }

    public Profile(int age, String sexe, String description, boolean accepter_animal, boolean accepter_fumeurs) {
        this.age = age;
        this.sexe = sexe;
        this.description = description;
        this.accepter_animal = accepter_animal;
        this.accepter_fumeurs = accepter_fumeurs;
    }

    public int getId_Profile() {
        return id_Profile;
    }

    public void setId_Profile(int id_Profile) {
        this.id_Profile = id_Profile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAccepter_animal() {
        return accepter_animal;
    }

    public void setAccepter_animal(boolean accepter_animal) {
        this.accepter_animal = accepter_animal;
    }

    public boolean isAccepter_fumeurs() {
        return accepter_fumeurs;
    }

    public void setAccepter_fumeurs(boolean accepter_fumeurs) {
        this.accepter_fumeurs = accepter_fumeurs;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id_Profile=" + id_Profile +
                ", age=" + age +
                ", sexe='" + sexe + '\'' +
                ", description='" + description + '\'' +
                ", accepter_animal=" + accepter_animal +
                ", accepter_fumeurs=" + accepter_fumeurs +
                ", utilisateur=" + utilisateur +
                '}';
    }
}
