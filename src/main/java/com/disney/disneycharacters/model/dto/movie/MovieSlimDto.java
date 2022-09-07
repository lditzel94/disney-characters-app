package com.disney.disneycharacters.model.dto.movie;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieSlimDto {

    @JsonProperty("id")
    private Long movieId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("releaseDate")
    private String releaseDate;

    @JsonProperty("rating")
    private Integer rating;

    /*@JsonProperty("genre")
    private Genre genre;*/
}
