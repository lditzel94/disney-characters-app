package com.disney.disneycharacters.mapper.mapstruct;

import com.disney.disneycharacters.model.dto.movie.MovieSlimDto;
import com.disney.disneycharacters.model.entity.Movie;
import org.mapstruct.Mapper;

@Mapper( componentModel = "spring" )
public interface MovieMapper {

    Movie actorDetailDtoToActor( MovieSlimDto movie );

    MovieSlimDto actorDetailDtoToActor( Movie movie );
}
