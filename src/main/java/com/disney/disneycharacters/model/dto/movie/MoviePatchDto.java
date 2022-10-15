package com.disney.disneycharacters.model.dto.movie;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MoviePatchDto(
        @JsonProperty( "title" )
        String title,

        @JsonProperty( "releaseDate" )
        String releaseDate,

        @JsonProperty( "rating" )
        Integer rating
) {
}
