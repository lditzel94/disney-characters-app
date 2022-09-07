package com.disney.disneycharacters.model.dto.movie;

import com.disney.disneycharacters.model.dto.actor.ActorSlimDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class MovieDetailDto {
    @JsonProperty( "id" )
    private Long movieId;

    @JsonProperty( "title" )
    private String title;

    @JsonProperty( "releaseDate" )
    private String releaseDate;

    @JsonProperty( "rating" )
    private Integer rating;

    /*@JsonProperty( "genre" )
    private String genre;*/

    @JsonProperty( "actors" )
    private Set<ActorSlimDto> actors;
}
