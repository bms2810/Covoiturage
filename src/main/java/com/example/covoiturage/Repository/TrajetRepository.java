package com.example.covoiturage.Repository;

import com.example.covoiturage.Entities.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrajetRepository extends JpaRepository<Trajet, Integer> {
}
