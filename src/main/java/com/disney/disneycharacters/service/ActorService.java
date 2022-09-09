package com.disney.disneycharacters.service;

import com.disney.disneycharacters.exception.ResourceNotFoundException;
import com.disney.disneycharacters.model.dto.actor.ActorPatchDto;
import com.disney.disneycharacters.model.entity.Actor;

import java.util.List;
import java.util.Optional;

public interface ActorService {
    Actor getActorDetail( Long id ) throws ResourceNotFoundException;

    Optional<Actor> createActor( Actor actor );

    Actor updateActor( ActorPatchDto actor, Long id ) throws ResourceNotFoundException;

    void deleteActorById( Long id ) throws ResourceNotFoundException;

    List<Actor> getAllActors();
}
