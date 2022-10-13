package com.disney.disneycharacters.service;

import com.disney.disneycharacters.model.dto.genre.GenrePostDto;

import java.util.List;

public interface GenreService {

    GenrePostDto create( GenrePostDto genre );

    List<GenrePostDto> getAll();
}
