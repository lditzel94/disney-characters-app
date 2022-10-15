package com.disney.disneycharacters.service;

import com.disney.disneycharacters.exception.ResourceNotFoundException;
import com.disney.disneycharacters.model.dto.movie.MovieDetailDto;
import com.disney.disneycharacters.model.dto.movie.MoviePatchDto;
import com.disney.disneycharacters.model.dto.movie.MoviePostDto;

import java.util.List;

public interface MovieService {
    List<MovieDetailDto> getAllMovies();

    MovieDetailDto getMovieDetailById( Long id ) throws ResourceNotFoundException;

    MovieDetailDto createMovie( MoviePostDto movie );

    MovieDetailDto updateMovie( MoviePatchDto movie, Long id ) throws ResourceNotFoundException;

    void deleteMovieById( Long id ) throws ResourceNotFoundException;

}
