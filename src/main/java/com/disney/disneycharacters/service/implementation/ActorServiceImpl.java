package com.disney.disneycharacters.service.implementation;

import com.disney.disneycharacters.exception.ResourceNotFoundException;
import com.disney.disneycharacters.mapper.mapstruct.ActorMapper;
import com.disney.disneycharacters.model.dto.actor.ActorDetailDto;
import com.disney.disneycharacters.model.dto.actor.ActorPatchDto;
import com.disney.disneycharacters.model.dto.actor.ActorPostDto;
import com.disney.disneycharacters.repository.ActorRepository;
import com.disney.disneycharacters.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ActorServiceImpl implements ActorService {
    private final ActorRepository repository;
    private final ActorMapper mapper;

    @Override
    public List<ActorDetailDto> getAllActors() {
        var actors = repository.findAll();
        return actors.stream()
                     .map( mapper::actorToActorDetailDto )
                     .collect( Collectors.toList() );
    }

    @Override
    public ActorDetailDto getActorDetailById( Long id ) throws ResourceNotFoundException {
        var actor = repository.findById( id )
                              .orElseThrow( ResourceNotFoundException::new );
        return mapper.actorToActorDetailDto( actor );
    }

    @Override
    public ActorDetailDto getActorDetailByName( String name ) throws ResourceNotFoundException {
        var actor = repository.findByName( name ).orElseThrow( ResourceNotFoundException::new );
        return mapper.actorToActorDetailDto( actor );
    }

    @Override
    public ActorDetailDto getActorDetailByAge( String age ) throws ResourceNotFoundException {
        var actor = repository.findByAge( age ).orElseThrow( ResourceNotFoundException::new );
        return mapper.actorToActorDetailDto( actor );
    }

    @Override
    public ActorDetailDto createActor( ActorPostDto actorDto ) {
        var saved = repository.save( mapper.actorPostToActor( actorDto ) );
        return mapper.actorToActorDetailDto( saved );
    }

    @Override
    public ActorDetailDto updateActor( ActorPatchDto actorPatch, Long id ) throws ResourceNotFoundException {
        var actor = repository.findById( id ).orElseThrow( ResourceNotFoundException::new );
        mapper.actorPatchToActor( actorPatch, actor );
        return mapper.actorToActorDetailDto( repository.save( actor ) );
    }

    @Override
    public void deleteActorById( Long id ) throws ResourceNotFoundException {
        try {
            repository.deleteById( id );
        } catch ( EmptyResultDataAccessException exception ) {
            throw new ResourceNotFoundException();
        }
    }
}