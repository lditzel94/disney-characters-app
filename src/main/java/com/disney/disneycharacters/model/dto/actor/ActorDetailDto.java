package com.disney.disneycharacters.model.dto.actor;

import com.disney.disneycharacters.model.dto.movie.MovieSlimDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

// TODO: Try changing to record class
public record ActorDetailDto(
        @JsonProperty( "id" ) Long id,
        @JsonProperty( "name" ) String name,
        @JsonProperty( "age" ) String age,
        @JsonProperty( "weight" ) Double weight,
        @JsonProperty( "story" ) String story,
        @JsonProperty( "movies" ) Set<MovieSlimDto> movies
) {
}

/*
@Getter
@Setter
public class ActorDetailDto {
    @JsonProperty( "id" )
    private Long id;

    @JsonProperty( "name" )
    private String name;

    @JsonProperty( "age" )
    private String age;

    @JsonProperty( "weight" )
    private Double weight;

    @JsonProperty( "story" )
    private String story;

    @JsonProperty( "movies" )
    private Set<MovieSlimDto> movies;
}*/
