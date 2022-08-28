package com.disney.disneycharacters.repository;

import com.disney.disneycharacters.model.entity.MovieCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieCharacterRepository extends JpaRepository<MovieCharacter, Long> {
}