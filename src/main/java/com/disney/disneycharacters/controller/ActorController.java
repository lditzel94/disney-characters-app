package com.disney.disneycharacters.controller;

import com.disney.disneycharacters.exception.ResourceNotFoundException;
import com.disney.disneycharacters.model.dto.actor.ActorDetailDto;
import com.disney.disneycharacters.model.dto.actor.ActorPatchDto;
import com.disney.disneycharacters.model.dto.actor.ActorPostDto;
import com.disney.disneycharacters.service.ActorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping( "/api/characters" )
class ActorController {
    private final ActorService service;

    @GetMapping
    List<ActorDetailDto> getAllActors() {
        return service.getAllActors();
    }

    @GetMapping( value = "/{id}")
    ActorDetailDto getActorDetailById( @PathVariable Long id ) throws ResourceNotFoundException {
        return service.getActorDetailById( id );
    }

    @GetMapping( params = "name" )
    ActorDetailDto getActorDetailByName( @RequestParam String name ) throws ResourceNotFoundException {
        return service.getActorDetailByName( name );
    }

    @GetMapping( params = "age" )
    ActorDetailDto getActorDetailByAge( @RequestParam String age ) throws ResourceNotFoundException {
        return service.getActorDetailByAge( age );
    }

    @PostMapping
    ActorDetailDto createActor( @Valid @RequestBody ActorPostDto actorDto ) {
        return service.createActor( actorDto );
    }

    @PatchMapping( "/{id}" )
    ActorDetailDto updateActor( @RequestBody ActorPatchDto actor, @PathVariable Long id ) throws ResourceNotFoundException {
        return service.updateActor( actor, id );
    }

    @ResponseStatus( OK )
    @DeleteMapping( "/{id}" )
    void deleteActor( @PathVariable Long id ) throws ResourceNotFoundException {
        service.deleteActorById( id );
    }
}
