package com.disney.disneycharacters.service.implementation;

import com.disney.disneycharacters.exception.ResourceNotFoundException;
import com.disney.disneycharacters.mapper.mapstruct.ActorMapper;
import com.disney.disneycharacters.model.dto.actor.ActorPatchDto;
import com.disney.disneycharacters.model.entity.Actor;
import com.disney.disneycharacters.repository.ActorRepository;
import com.disney.disneycharacters.service.ActorService;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ActorServiceImpl implements ActorService {
    private final ActorRepository actorRepository;
    private final ActorMapper actorMapper;

    public ActorServiceImpl( ActorRepository actorRepository, ActorMapper actorMapper ) {
        this.actorRepository = actorRepository;
        this.actorMapper = actorMapper;
    }


    @Override
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    @Override
    public Actor getActorDetail( Long id ) throws ResourceNotFoundException {
        var actor = actorRepository.findById( id ).orElseThrow( ResourceNotFoundException::new );
        return actor;
    }

    @Override
    public Optional<Actor> createActor( Actor actor ) {
        var saved = actorRepository.save( actor );
        return Optional.of( saved );
    }

    @Override
    public Actor updateActor( ActorPatchDto actor, Long id ) throws ResourceNotFoundException {
        var found = actorRepository.findById( id ).orElseThrow( ResourceNotFoundException::new );
        actorMapper.actorPatchToActor( actor, found );

        return actorRepository.save( found );
    }

    @Override
    public void deleteActorById( Long id ) throws ResourceNotFoundException {
        try {
            actorRepository.deleteById( id );
        } catch ( EmptyResultDataAccessException exception ) {
            throw new ResourceNotFoundException();
        }
    }
}