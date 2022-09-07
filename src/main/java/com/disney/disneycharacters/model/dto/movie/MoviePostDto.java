package com.disney.disneycharacters.model.dto.movie;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MoviePostDto {

    @JsonProperty( "title" )
    private String title;

    @JsonProperty( "releaseDate" )
    private String releaseDate;

    @JsonProperty( "rating" )
    private Integer rating;

}
