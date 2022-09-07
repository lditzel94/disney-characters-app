package com.disney.disneycharacters.controller;

import com.disney.disneycharacters.mapper.mapstruct.GenreMapper;
import com.disney.disneycharacters.model.dto.genre.GenrePostDto;
import com.disney.disneycharacters.service.GenreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping( "/api/genres" )
class GenreController {

    private final GenreService genreService;
    private final GenreMapper genreMapper;

    @PostMapping
    @ResponseStatus( CREATED )
    public void createGenre( @Valid @RequestBody GenrePostDto genre ) {
        genreService.createGenre( genreMapper.genrePostDtoToGenre( genre ) );
    }
}
