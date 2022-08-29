package com.disney.disneycharacters.controller;

import com.disney.disneycharacters.model.entity.MovieCharacter;
import com.disney.disneycharacters.repository.MovieCharacterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping( "/api/characters" )
public class MovieCharacterController {

    private final MovieCharacterRepository movieCharacterRepository;

    // TODO: Search for a bulkified option to build the creation method
    @PostMapping
    public void createCharacters( @RequestBody MovieCharacter movieCharacter ) {
        log.info( "Post Movie character: " + movieCharacter );
    }

    @PatchMapping( "/{id}" )
    public void updateCharacter( @RequestBody MovieCharacter movieCharacter, @PathVariable Long id ) {
        log.info( "Patch Movie character: " + movieCharacter );
        log.info( "Patch character id: " + id );
    }

    @DeleteMapping( "/{id}" )
    public void deleteCharacter( @PathVariable Long id ) {
        log.info( "Delete character id: " + id );
    }

}
