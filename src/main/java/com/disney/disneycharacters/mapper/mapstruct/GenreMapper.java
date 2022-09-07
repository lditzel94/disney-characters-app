package com.disney.disneycharacters.mapper.mapstruct;

import com.disney.disneycharacters.model.dto.genre.GenrePostDto;
import com.disney.disneycharacters.model.entity.Genre;
import org.mapstruct.Mapper;

@Mapper( componentModel = "spring" )
public interface GenreMapper {

    Genre genrePostDtoToGenre( GenrePostDto genre );

    GenrePostDto genreToGenrePostDtoTo( Genre genre );
}
