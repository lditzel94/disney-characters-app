package com.disney.disneycharacters.model.dto.movie;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public record MoviePostDto(
        @NotBlank( message = "Title cannot be empty or null" )
        @JsonProperty( "title" )
        String title,

        @NotBlank( message = "Release date cannot be empty or null" )
        @JsonProperty( "releaseDate" )
        String releaseDate,

        @NotNull( message = "Rating cannot be empty or null" )
        @JsonProperty( "rating" )
        Integer rating

) {
}
