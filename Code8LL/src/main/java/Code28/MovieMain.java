package Code28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MovieMain {
    public static void main(String[] args) {

        // Create a list of movies
        List<Movie> movies = new ArrayList<Movie>(Arrays.asList(
                new Movie("The Empire Strikes Back", 1980, Arrays.asList("Action", "Adventure", "Fantasy")),
                new Movie("Blade Runner", 1982, Arrays.asList("Action", "Sci-Fi", "Thriller")),
                new Movie("Return of the Jedi", 1983, Arrays.asList("Action", "Adventure", "Fantasy")),
                new Movie("The Terminator", 1984, Arrays.asList("Action", "Sci-Fi")),
                new Movie("Back to the Future", 1985, Arrays.asList("Adventure", "Comedy", "Sci-Fi")),
                new Movie("Aliens", 1986, Arrays.asList("Action", "Adventure", "Sci-Fi")),
                new Movie("RoboCop", 1987, Arrays.asList("Action", "Crime", "Sci-Fi")),
                new Movie("Die Hard", 1988, Arrays.asList("Action", "Thriller")),
                new Movie("Indiana Jones and the Last Crusade", 1989, Arrays.asList("Action", "Adventure"))
        ));

        // Sort by year
        Collections.sort(movies, MovieComparators.getYearComparator());

        // Print sorted by year
        System.out.println("Sorted by year:");
        for (Movie movie : movies) {
            System.out.println(movie.getYear() + ": " + movie.getTitle());
        }

        // Sort by title
        Collections.sort(movies, MovieComparators.getTitleComparator());

        // Print sorted by title
        System.out.println("\nSorted by title:");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }
    }
}
