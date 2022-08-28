package com.disney.disneycharacters.model.entity;

import com.disney.disneycharacters.model.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Genre extends BaseEntity {

    @NotBlank( message = "Title cannot be blank" )
    @Size( max = 50, message = "Title must be at most 50 characters long" )
    private String name;

    @OneToMany( mappedBy = "genre", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, targetEntity = Movie.class )
    @ToString.Exclude
    private Set<Movie> movies = new HashSet<>();
}
