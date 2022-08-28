package com.disney.disneycharacters.model.entity;

import com.disney.disneycharacters.model.entity.base.BaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class MovieCharacter extends BaseEntity {

    @NotBlank( message = "Name cannot be blank" )
    @Size( max = 50, message = "Name must be at most 50 characters long" )
    private String name;

    @NotBlank( message = "Age cannot be blank" )
    @Size( max = 4, message = "Age cannot be bigger than 4" )
    private String age;

    @NotEmpty( message = "Weight cannot be blank" )
    @Size( max = 2, message = "Age cannot be bigger than 4" )
    private Double weight;

    @Size( max = 400, message = "Maximum characters reached" )
    private String story;

    // TODO: Cannot resolve column 'movie_id'
    @ManyToOne( fetch = FetchType.LAZY, optional = false )
    @JoinColumn( name = "movie_id", referencedColumnName = "id", nullable = false )
    private Movie movie;
}