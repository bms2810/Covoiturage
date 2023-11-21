package com.example.covoiturage.Repository;

import com.example.covoiturage.Entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
