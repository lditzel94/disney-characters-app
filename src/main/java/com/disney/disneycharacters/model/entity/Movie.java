package com.disney.disneycharacters.model.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table( name = "movie" )
@JsonIdentityInfo( generator = ObjectIdGenerators.UUIDGenerator.class, property="@UUID")
public class Movie {

    @Id
    @GeneratedValue( strategy = IDENTITY )
    @Column( name = "movie_id" )
    private Long movieId;

    private String title;

    private String releaseDate;

    private Integer rating;


    /*@ManyToOne( fetch = LAZY, optional = false )
    @JoinColumn( name = "genre_id", nullable = false )
    private Genre genre;*/

    @JoinTable( name = "movie_actors",
                joinColumns = @JoinColumn( name = "movie_id" ),
                inverseJoinColumns = @JoinColumn( name = "actor_id" ) )
    @ManyToMany( fetch = LAZY, targetEntity = Movie.class )
    private List<Actor> actors = new ArrayList<>();
}
