package com.disney.disneycharacters.model.dto.movie;

import com.fasterxml.jackson.annotation.JsonProperty;


public record MovieSlimDto(
        @JsonProperty( "id" )
        Long movieId,

        @JsonProperty( "title" )
        String title,

        @JsonProperty( "releaseDate" )
        String releaseDate,

        @JsonProperty( "rating" )
        Integer rating
) {
    /*@JsonProperty("genre")
    private Genre genre;*/
}
