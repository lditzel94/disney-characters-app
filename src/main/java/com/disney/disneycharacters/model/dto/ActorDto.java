package com.disney.disneycharacters.model.dto;

import com.disney.disneycharacters.model.entity.Actor;
import lombok.Data;

import java.util.Collection;
import java.util.stream.Collectors;

@Data
public class ActorDto {
    private Long actorId;
    private String name;
    private String age;
    private Double weight;
    private String story;
    private Collection<MovieDto> movies;

    public ActorDto( Actor actor ) {
        setActorId( actor.getActorId() );
        setName( actor.getName() );
        setAge( actor.getAge() );
        setWeight( actor.getWeight() );
        setStory( actor.getStory() );
        setMovies( actor.getMovies()
                        .stream()
                        .map( MovieDto::new )
                        .collect( Collectors.toList() ) );
    }
}
