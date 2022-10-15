package com.disney.disneycharacters.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table( name = "actor" )
public class Actor {
    @Id
    @GeneratedValue( strategy = IDENTITY )
    @Column( name = "actor_id" )
    private Long actorId;

    @Column( unique = true )
    private String name;

    private String age;

    private Double weight;

    // TODO: Research for @Lob annotation, this may help with data types that need to be large sets
    private String story;

    @ManyToMany( mappedBy = "actors", fetch = LAZY, cascade = PERSIST )
    private Set<Movie> movies = new HashSet<>();
}