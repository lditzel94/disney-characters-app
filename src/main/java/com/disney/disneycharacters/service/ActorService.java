package com.disney.disneycharacters.service;

import com.disney.disneycharacters.exception.ResourceNotFoundException;
import com.disney.disneycharacters.model.dto.actor.ActorPatchDto;
import com.disney.disneycharacters.model.entity.Actor;

import java.util.Optional;

public interface ActorService {
    Optional<Actor> getActorDetail( Long id );

    Optional<Actor> createActor( Actor actor );

    Actor updateActor( ActorPatchDto actor, Long id ) throws ResourceNotFoundException;

    void deleteActorById( Long id );
}
