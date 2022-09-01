package com.disney.disneycharacters.model.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table( name = "actor" )
@JsonIdentityInfo( generator = ObjectIdGenerators.UUIDGenerator.class, property="@UUID")
public class Actor {

    @Id
    @GeneratedValue( strategy = IDENTITY )
    @Column( name = "actor_id" )
    private Long actorId;

    private String name;

    private String age;

    private Double weight;

    // TODO: Research for @Lob annotation, this may help with data types that need to be large sets
    private String story;

    @ManyToMany( mappedBy = "actors", fetch = LAZY, cascade = PERSIST )
    private List<Movie> movies = new ArrayList<>();
}