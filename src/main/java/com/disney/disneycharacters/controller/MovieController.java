package com.disney.disneycharacters.controller;

import com.disney.disneycharacters.exception.ResourceNotFoundException;
import com.disney.disneycharacters.model.dto.movie.MovieDetailDto;
import com.disney.disneycharacters.model.dto.movie.MoviePatchDto;
import com.disney.disneycharacters.model.dto.movie.MoviePostDto;
import com.disney.disneycharacters.service.MovieService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping( "/api/movies" )
class MovieController {
    private final MovieService service;

    @GetMapping
    List<MovieDetailDto> getAllMovies() {
        return service.getAllMovies();
    }

    @GetMapping( "/{id}" )
    MovieDetailDto getMovieDetailById( @PathVariable Long id ) throws ResourceNotFoundException {
        return service.getMovieDetailById( id );
    }

    @PostMapping
    MovieDetailDto createMovie( @Valid @RequestBody MoviePostDto moviePostDto ) {
        return service.createMovie( moviePostDto );
    }

    @PatchMapping( "/{id}" )
    MovieDetailDto updateMovie( @RequestBody MoviePatchDto moviePatchDto, @PathVariable Long id ) throws ResourceNotFoundException {
        return service.updateMovie( moviePatchDto, id );
    }

    @ResponseStatus( OK )
    @DeleteMapping( "/{id}" )
    void deleteMovie( @PathVariable Long id ) throws ResourceNotFoundException {
        service.deleteMovieById( id );
    }
}
