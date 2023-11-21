package com.example.covoiturage.Repository;

import com.example.covoiturage.Entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
}
