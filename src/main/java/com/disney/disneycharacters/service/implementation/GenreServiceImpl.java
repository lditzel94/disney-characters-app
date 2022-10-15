package com.disney.disneycharacters.service.implementation;

import com.disney.disneycharacters.mapper.mapstruct.GenreMapper;
import com.disney.disneycharacters.model.dto.genre.GenrePostDto;
import com.disney.disneycharacters.repository.GenreRepository;
import com.disney.disneycharacters.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;
    private final GenreMapper genreMapper;


    @Override
    public GenrePostDto create( GenrePostDto genre ) {
        var saved = genreRepository.save( genreMapper.genrePostDtoToGenre( genre ) );
        return genreMapper.genreToGenrePostDto( saved );
    }

    @Override
    public List<GenrePostDto> getAll() {
        var genres = genreRepository.findAll();
        return genres.stream()
                     .map( genreMapper::genreToGenrePostDto )
                     .toList();
    }
}
