package com.disney.disneycharacters.model.entity.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import static javax.persistence.GenerationType.IDENTITY;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class BaseEntity extends AuditedEntity {
    @Id
    @GeneratedValue( strategy = IDENTITY )
    @Column( name = "id" )
    protected Long id;

    @NotBlank( message = "Image cannot be blank" )
    @Size( max = 500, message = "Image url has maximum of 500 characters" )
    protected String imageUrl;
}
