package com.disney.disneycharacters.controller;

import com.disney.disneycharacters.model.dto.genre.GenrePostDto;
import com.disney.disneycharacters.service.GenreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping( "/api/genres" )
class GenreController {

    private final GenreService genreService;

    @GetMapping
    List<GenrePostDto> getAllGenres() {
        return genreService.getAll();
    }

    @PostMapping
    @ResponseStatus( CREATED )
    GenrePostDto createGenre( @Valid @RequestBody GenrePostDto genre ) {
        return genreService.create( genre );
    }
}
