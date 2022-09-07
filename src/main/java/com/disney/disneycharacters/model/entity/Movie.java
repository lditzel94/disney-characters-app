package com.disney.disneycharacters.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table( name = "movie" )
public class Movie {
    @Id
    @GeneratedValue( strategy = IDENTITY )
    @Column( name = "movie_id" )
    private Long movieId;

    private String title;

    private String releaseDate;

    private Integer rating;

    @ManyToOne( fetch = LAZY, optional = false )
    @JoinColumn( name = "genre_id", nullable = false )
    private Genre genre;

    @JoinTable( name = "movie_actors",
                joinColumns = @JoinColumn( name = "movie_id" ),
                inverseJoinColumns = @JoinColumn( name = "actor_id" ) )
    @ManyToMany( fetch = LAZY )
    private Set<Actor> actors = new HashSet<>();
}
