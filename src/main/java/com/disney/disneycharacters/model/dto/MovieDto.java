package com.disney.disneycharacters.model.dto;

import com.disney.disneycharacters.model.entity.Actor;
import com.disney.disneycharacters.model.entity.Movie;
import lombok.Data;

import java.util.Collection;
import java.util.stream.Collectors;

@Data
public class MovieDto {
    private Long movieId;
    private String title;
    private String releaseDate;
    private Integer rating;
    private Collection<ActorDto> actors;

    public MovieDto( Movie movie ) {
        setMovieId( movie.getMovieId() );
        setTitle( movie.getTitle() );
        setReleaseDate( movie.getReleaseDate() );
        setRating( movie.getRating() );
        setActors( movie.getActors()
                        .stream()
                        .map( ActorDto::new )
                        .collect( Collectors.toList() ) );
    }

    @Data
    private static class ActorDto {
        private Long actorId;
        private String name;
        private String age;
        private Double weight;
        private String story;

        public ActorDto( Actor actor ) {
            setActorId( actor.getActorId() );
            setName( actor.getName() );
            setAge( actor.getAge() );
            setWeight( actor.getWeight() );
            setStory( actor.getStory() );
        }
    }
}
