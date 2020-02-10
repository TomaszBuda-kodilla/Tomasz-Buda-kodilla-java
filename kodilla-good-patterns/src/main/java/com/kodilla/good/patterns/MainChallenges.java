package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainChallenges {
    public static void main(String[] args) {
        MovieStore movies = new MovieStore();

        movies.getMovies().values().stream()
                .limit(movies.getMovies().size())
                .forEach(System.out::print);
        System.out.println("!");


        movies.getMovies().values().stream()
                //.flatMap(movie -> movies.getMovies().values().stream())
                .limit(movies.getMovies().size())
                //.map(MovieStore::getMovies)
                .forEach(System.out::print);

    }
}

