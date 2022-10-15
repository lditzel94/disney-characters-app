package com.disney.disneycharacters.model.dto.genre;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;


public record GenrePostDto(
        @NotBlank( message = "Name cannot be empty or null" )
        @JsonProperty( "name" )
        String name ) {
}
