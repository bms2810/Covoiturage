package com.example.covoiturage.Repository;

import com.example.covoiturage.Entities.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConducteurRepository extends JpaRepository<Conducteur, Integer> {
}
