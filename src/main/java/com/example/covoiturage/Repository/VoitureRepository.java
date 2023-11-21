package com.example.covoiturage.Repository;

import com.example.covoiturage.Entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Integer> {
}
