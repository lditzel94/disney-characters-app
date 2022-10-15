package com.disney.disneycharacters.repository;

import com.disney.disneycharacters.model.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    public Movie findByTitle( String title );
}