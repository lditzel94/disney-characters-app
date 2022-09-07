package com.disney.disneycharacters.service.implementation;

import com.disney.disneycharacters.exception.ResourceNotFoundException;
import com.disney.disneycharacters.mapper.mapstruct.ActorMapper;
import com.disney.disneycharacters.model.dto.actor.ActorPatchDto;
import com.disney.disneycharacters.model.entity.Actor;
import com.disney.disneycharacters.repository.ActorRepository;
import com.disney.disneycharacters.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ActorServiceImpl implements ActorService {
    private final ActorRepository actorRepository;
    private final ActorMapper actorMapper;

    @Override
    public Optional<Actor> getActorDetail( Long id ) {
        var actor = actorRepository.findById( id );
        return actor;
    }

    @Override
    public Optional<Actor> createActor( Actor actor ) {
        Actor saved = actorRepository.save( actor );
        return Optional.of( saved );
    }

    @Override
    public Actor updateActor( ActorPatchDto actor, Long id ) throws ResourceNotFoundException {
        Actor found = actorRepository.findById( id ).orElseThrow( ResourceNotFoundException::new );
        actorMapper.actorPatchToActor( actor, found );

        return actorRepository.save( found );
    }

    @Override
    public void deleteActorById( Long id ) {
        actorRepository.deleteById( id );
    }
}