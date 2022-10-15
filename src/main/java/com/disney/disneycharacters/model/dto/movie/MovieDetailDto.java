package com.disney.disneycharacters.model.dto.movie;

import com.disney.disneycharacters.model.dto.actor.ActorSlimDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

public record MovieDetailDto(
        @JsonProperty( "id" )
        Long id,

        @JsonProperty( "title" )
        String title,

        @JsonProperty( "releaseDate" )
        String releaseDate,

        @JsonProperty( "rating" )
        Integer rating,

        @JsonProperty( "genre" )
        String genre,

        @JsonProperty( "actors" )
        Set<ActorSlimDto> actors
) {
}
