package com.disney.disneycharacters.repository;

import com.disney.disneycharacters.model.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    Optional<Actor> findByName( String name );

    Optional<Actor> findByAge( String age );
}