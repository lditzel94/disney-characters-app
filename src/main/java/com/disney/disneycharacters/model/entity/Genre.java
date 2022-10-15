package com.disney.disneycharacters.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@ToString
@Entity
@Table( name = "genre" )
public class Genre {
    @Id
    @GeneratedValue( strategy = IDENTITY )
    @Column( name = "genre_id" )
    private Long genreId;

    @Column( unique = true )
    private String name;

    @OneToMany( mappedBy = "genre", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, targetEntity = Movie.class )
    private Set<Movie> movies = new HashSet<>();
}
