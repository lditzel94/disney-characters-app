package com.disney.disneycharacters.service;

import com.disney.disneycharacters.exception.ResourceNotFoundException;
import com.disney.disneycharacters.model.dto.actor.ActorDetailDto;
import com.disney.disneycharacters.model.dto.actor.ActorPatchDto;
import com.disney.disneycharacters.model.dto.actor.ActorPostDto;

import java.util.List;

public interface ActorService {
    List<ActorDetailDto> getAllActors();

    ActorDetailDto getActorDetailById( Long id ) throws ResourceNotFoundException;

    ActorDetailDto getActorDetailByName( String name ) throws ResourceNotFoundException;

    ActorDetailDto getActorDetailByAge( String age ) throws ResourceNotFoundException;

    ActorDetailDto createActor( ActorPostDto actor );

    ActorDetailDto updateActor( ActorPatchDto actor, Long id ) throws ResourceNotFoundException;

    void deleteActorById( Long id ) throws ResourceNotFoundException;

}
