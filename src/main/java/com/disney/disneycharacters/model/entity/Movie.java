package com.disney.disneycharacters.model.entity;

import com.disney.disneycharacters.model.entity.base.BaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Movie extends BaseEntity {

    @NotBlank( message = "Title cannot be blank" )
    @Size( max = 50, message = "Title must be at most 50 characters long" )
    private String title;

    private String releaseDate;
    private Integer rating;

    @OneToMany( mappedBy = "movie", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, targetEntity = MovieCharacter.class )
    private Set<MovieCharacter> movieCharacterSet = new HashSet<>();

    @ManyToOne( fetch = FetchType.LAZY, optional = false )
    @JoinColumn( name = "genre_id", referencedColumnName = "id", nullable = false )
    private Genre genre;
}
