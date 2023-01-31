package com.kodilla.challenges;

public class ChallangesMain {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        movieStore.printMoviesSeparedWithExclamationMark(movieStore.getMovies());
    }
}
