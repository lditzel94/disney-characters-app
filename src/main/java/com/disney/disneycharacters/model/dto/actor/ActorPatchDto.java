package com.disney.disneycharacters.model.dto.actor;

import com.fasterxml.jackson.annotation.JsonProperty;


public record ActorPatchDto(
        @JsonProperty( "name" ) String name,
        @JsonProperty( "age" ) String age,
        @JsonProperty( "weight" ) Double weight,
        @JsonProperty( "story" ) String story
) {
}
