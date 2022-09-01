package com.disney.disneycharacters.model.dto;

import com.disney.disneycharacters.model.entity.Movie;
import lombok.Data;

@Data
public class MovieDto {
    private Long movieId;
    private String title;
    private String releaseDate;
    private Integer rating;

    public MovieDto( Movie movie ) {
        setMovieId( movie.getMovieId() );
        setTitle( movie.getTitle() );
        setReleaseDate( movie.getReleaseDate() );
        setRating( movie.getRating() );
    }
}
