package com.disney.disneycharacters.model.dto.actor;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record ActorPostDto(
        @NotBlank( message = "Name cannot be empty or null" )
        @JsonProperty( "name" )
        String name,

        @NotBlank( message = "Age cannot be empty or null" )
        @JsonProperty( "age" )
        String age,

        @NotNull( message = "Weight cannot be empty or null" )
        @JsonProperty( "weight" )
        Double weight,

        @NotBlank( message = "Story cannot be empty or null" )
        @JsonProperty( "story" )
        String story
) {
}