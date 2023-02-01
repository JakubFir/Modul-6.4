package com.kodilla.challenges.movies;
public class ChallangesMain {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        movieStore.printMoviesSeparedWithExclamationMark(movieStore.getMovies());
    }
}
