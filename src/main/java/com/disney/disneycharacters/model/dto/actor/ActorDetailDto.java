package com.disney.disneycharacters.model.dto.actor;

import com.disney.disneycharacters.model.dto.movie.MovieSlimDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public record ActorDetailDto(
        @JsonProperty( "id" ) Long id,
        @JsonProperty( "name" ) String name,
        @JsonProperty( "age" ) String age,
        @JsonProperty( "weight" ) Double weight,
        @JsonProperty( "story" ) String story,
        @JsonProperty( "movies" ) Set<MovieSlimDto> movies
) {
}
