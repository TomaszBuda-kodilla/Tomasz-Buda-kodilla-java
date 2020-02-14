package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.stream.Collectors;

public class MainChallenges {
    public static void main(String[] args) {
        MovieStore movies = new MovieStore();
        String myCollection = movies.getMovies().values().stream()
                .flatMap(movie -> movie.stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(myCollection);

    }
}

