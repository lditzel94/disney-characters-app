package com.disney.disneycharacters.controller;

import com.disney.disneycharacters.exception.ResourceNotFoundException;
import com.disney.disneycharacters.mapper.mapstruct.ActorMapper;
import com.disney.disneycharacters.model.dto.actor.ActorDetailDto;
import com.disney.disneycharacters.model.dto.actor.ActorPatchDto;
import com.disney.disneycharacters.model.dto.actor.ActorPostDto;
import com.disney.disneycharacters.model.entity.Actor;
import com.disney.disneycharacters.service.ActorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping( "/api/characters" )
class ActorController {

    private final ActorMapper actorMapper;
    private final ActorService actorService;

    @GetMapping( "/{id}" )
    public ActorDetailDto getActorDetail( @PathVariable Long id ) {
        var actor = actorService.getActorDetail( id ).get();

        return actorMapper.actorToActorDetailDto( actor );
    }

    // TODO: Search for a bulkified option to build the creation method
    @PostMapping
    public ActorDetailDto createCharacters( @Valid @RequestBody ActorPostDto actorDto ) {
        var actor = actorService.createActor( actorMapper.actorPostToActor( actorDto ) );
        return actorMapper.actorToActorDetailDto( actor.get() );
    }

    @PatchMapping( "/{id}" )
    public ActorDetailDto updateCharacter( @RequestBody ActorPatchDto actor, @PathVariable Long id ) throws ResourceNotFoundException {
        Actor updated = actorService.updateActor( actor, id );
        return actorMapper.actorToActorDetailDto( updated );
    }

    @DeleteMapping( "/{id}" )
    @ResponseStatus( OK )
    public void deleteCharacter( @PathVariable Long id ) {
        actorService.deleteActorById( id );
    }

}
