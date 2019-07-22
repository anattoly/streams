package main.java.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class MoviePoster {

    private static List<Movie> listPosterCinemaOne() {
        List<Movie> moviesPoster = new ArrayList<>();
        moviesPoster.add(new Movie("Mile 22", "Action", 120D));
        moviesPoster.add(new Movie("Ocean`s 8", "Comedy ", 90D));
        moviesPoster.add(new Movie("Fighting Back", "Thriller", 70D));
        moviesPoster.add(new Movie("Tomb Raider", "Fantasy", 150D));
        moviesPoster.add(new Movie("Jigeum, Mannareo Gabmida", "Drama", 55D));
        moviesPoster.add(new Movie("Johnny English Strikes Again", "Adventure", 100D));
        moviesPoster.add(new Movie("Ayka", "Drama", 70D));
        moviesPoster.add(new Movie("Aquaman", "Fantasy", 190D));
        moviesPoster.add(new Movie("Upgrade", "Horror", 190D));
        moviesPoster.add(new Movie("Asterix and secret potion", "Family", 190D));

        return moviesPoster;
    }

    private static List<Movie> listPosterCinemaTwo() {
        List<Movie> moviesPoster = new ArrayList<>();
        moviesPoster.add(new Movie("AXL", "Fiction", 50D));
        moviesPoster.add(new Movie("Acts of Violence", "Action", 110D));
        moviesPoster.add(new Movie("Alpha", "Family", 100D));
        moviesPoster.add(new Movie("Brawler", "Historical", 60D));
        moviesPoster.add(new Movie("Empire V", "Fantasy", 120D));
        moviesPoster.add(new Movie("Aniara", "Fiction", 80D));
        moviesPoster.add(new Movie("Annihilation", "Adventure", 120D));
        return moviesPoster;
    }

    public static Map<String, Double> getAveragePrice() {
        return Stream.concat(listPosterCinemaOne().stream(), listPosterCinemaTwo().stream())
                .collect(groupingBy(Movie::getGenre, averagingDouble(Movie::getPrice)));
    }

    public static Map<String, Long> getQuantityMovieOfGenre() {
        return Stream.concat(listPosterCinemaOne().stream(), listPosterCinemaTwo().stream())
                .collect(groupingBy(Movie::getGenre, counting()));
    }
}
