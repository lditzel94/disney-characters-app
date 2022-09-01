package com.disney.disneycharacters.controller;

import com.disney.disneycharacters.model.dto.ActorDto;
import com.disney.disneycharacters.model.entity.Actor;
import com.disney.disneycharacters.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping( "/api/characters" )
public class ActorController {

    private final ActorRepository actorRepository;

    @GetMapping( "/{id}" )
    public ActorDto getActorDetail( @PathVariable Long id ) {
        var actor = actorRepository.findById( id ).get();

        return new ActorDto( actor );
    }

    // TODO: Search for a bulkified option to build the creation method
    @PostMapping
    public void createCharacters( @RequestBody Actor actor ) {
        log.info( "Post Movie character: " + actor );
    }

    @PatchMapping( "/{id}" )
    public void updateCharacter( @RequestBody Actor actor, @PathVariable Long id ) {
        log.info( "Patch Movie character: " + actor );
        log.info( "Patch character id: " + id );
    }

    @DeleteMapping( "/{id}" )
    public void deleteCharacter( @PathVariable Long id ) {
        log.info( "Delete character id: " + id );
    }

}