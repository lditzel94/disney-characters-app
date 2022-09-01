package com.disney.disneycharacters.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
@Table( name = "genre" )
public class Genre {

    @Id
    @GeneratedValue( strategy = IDENTITY )
    @Column( name = "genre_id" )
    private Long genreId;
    private String name;


    /*@OneToMany( mappedBy = "genre", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, targetEntity = Movie.class )
    private List<Movie> movies = new ArrayList<>();*/
}
