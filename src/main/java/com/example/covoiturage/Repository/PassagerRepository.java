package com.example.covoiturage.Repository;

import com.example.covoiturage.Entities.Passager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassagerRepository extends JpaRepository<Passager, Integer> {
}
