package com.disney.disneycharacters.service;

import com.disney.disneycharacters.model.entity.Genre;

import java.util.Optional;

public interface GenreService {

    Optional<Genre> createGenre( Genre genre );
}
