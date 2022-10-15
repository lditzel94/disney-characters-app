package com.disney.disneycharacters.service.implementation;

import com.disney.disneycharacters.exception.ResourceNotFoundException;
import com.disney.disneycharacters.mapper.mapstruct.MovieMapper;
import com.disney.disneycharacters.model.dto.movie.MovieDetailDto;
import com.disney.disneycharacters.model.dto.movie.MoviePatchDto;
import com.disney.disneycharacters.model.dto.movie.MoviePostDto;
import com.disney.disneycharacters.repository.MovieRepository;
import com.disney.disneycharacters.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieRepository repository;
    private final MovieMapper mapper;

    @Override
    public List<MovieDetailDto> getAllMovies() {
        var movies = repository.findAll();
        return movies.stream()
                     .map( mapper::movieToMovieDetail )
                     .toList();
    }

    @Override
    public MovieDetailDto getMovieDetailById( Long id ) throws ResourceNotFoundException {
        var movie = repository.findById( id )
                              .orElseThrow( ResourceNotFoundException::new );
        return mapper.movieToMovieDetail( movie );
    }

    @Override
    public MovieDetailDto createMovie( MoviePostDto movie ) {
        var saved = repository.save( mapper.moviePostToMovie( movie ) );
        return mapper.movieToMovieDetail( saved );
    }

    @Override
    public MovieDetailDto updateMovie( MoviePatchDto moviePatch, Long id ) throws ResourceNotFoundException {
        var movie = repository.findById( id )
                              .orElseThrow( ResourceNotFoundException::new );
        mapper.moviePatchToMovie( moviePatch, movie );
        return mapper.movieToMovieDetail( repository.save( movie ) );
    }

    @Override
    public void deleteMovieById( Long id ) throws ResourceNotFoundException {
        try {
            repository.deleteById( id );
        } catch ( EmptyResultDataAccessException exception ) {
            throw new ResourceNotFoundException( exception.getMessage() );
        }
    }
}
