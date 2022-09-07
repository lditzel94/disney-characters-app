package com.disney.disneycharacters.service.implementation;

import com.disney.disneycharacters.model.entity.Genre;
import com.disney.disneycharacters.repository.GenreRepository;
import com.disney.disneycharacters.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    @Override
    public Optional<Genre> createGenre( Genre genre ) {
        var saved = genreRepository.save( genre );
        return Optional.of( saved );
    }
}
