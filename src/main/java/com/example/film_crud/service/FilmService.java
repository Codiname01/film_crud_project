package com.example.film_crud.service;

import com.example.film_crud.dto.FilmCreateUpdateDTO;
import com.example.film_crud.dto.FilmDetailDTO;
import com.example.film_crud.dto.FilmListDTO;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface FilmService {

    @Cacheable(value = "films")
    List<FilmListDTO> getAllFilms(); // Obtener todas las películas para la lista

    @Cacheable(value = "film", key = "#id")
    FilmDetailDTO getFilmById(Long id); // Obtener detalles de una película específica

    Boolean createFilm(FilmCreateUpdateDTO filmCreateUpdateDTO); // Crear una nueva película

    Boolean updateFilm(Long id, FilmCreateUpdateDTO filmCreateUpdateDTO); // Actualizar una película existente

    Boolean deleteFilm(Long id); // Eliminar una película
}
