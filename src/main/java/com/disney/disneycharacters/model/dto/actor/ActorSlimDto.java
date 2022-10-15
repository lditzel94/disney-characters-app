package com.disney.disneycharacters.model.dto.actor;

import com.fasterxml.jackson.annotation.JsonProperty;


public record ActorSlimDto(
        @JsonProperty( "id" )
        Long actorId,

        @JsonProperty( "name" )
        String name,

        @JsonProperty( "age" )
        String age,

        @JsonProperty( "weight" )
        Double weight,

        @JsonProperty( "story" )
        String story ) {
}
