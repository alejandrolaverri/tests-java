package com.alejandromo.javatests.movies.service;

import com.alejandromo.javatests.movies.data.MovieRepository;
import com.alejandromo.javatests.movies.model.Genre;
import com.alejandromo.javatests.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre().equals(genre)).collect(Collectors.toList());
    }
}