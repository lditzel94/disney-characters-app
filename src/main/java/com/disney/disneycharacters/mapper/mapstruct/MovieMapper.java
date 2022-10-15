package com.disney.disneycharacters.mapper.mapstruct;

import com.disney.disneycharacters.model.dto.movie.MovieDetailDto;
import com.disney.disneycharacters.model.dto.movie.MoviePatchDto;
import com.disney.disneycharacters.model.dto.movie.MoviePostDto;
import com.disney.disneycharacters.model.entity.Genre;
import com.disney.disneycharacters.model.entity.Movie;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.Optional;

import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper( componentModel = "spring" )
public interface MovieMapper {

    @Mapping( target = "id", source = "movieId" )
    @Mapping( target = "genre", expression = "java(mapGenre(movie))" )
    MovieDetailDto movieToMovieDetail( Movie movie );

    Movie moviePostToMovie( MoviePostDto movie );

    @BeanMapping( nullValuePropertyMappingStrategy = IGNORE )
    void moviePatchToMovie( MoviePatchDto moviePatchDto, @MappingTarget Movie movie );

    default String mapGenre( Movie movie ) {
        Optional<Genre> genre = Optional.ofNullable( movie.getGenre() );
        return genre.isPresent() ? genre.get().getName() : "";
    }
}
