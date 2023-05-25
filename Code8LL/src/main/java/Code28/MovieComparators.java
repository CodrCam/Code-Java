package Code28;

import java.util.Comparator;

public class MovieComparators {

    // year sort
    public static Comparator<Movie> getYearComparator() {
        return new Comparator<Movie>() {
            public int compare(Movie m1, Movie m2) {
                return m2.getYear() - m1.getYear();
            }
        };
    }

    // ignores "A", "An", or "The"
    public static Comparator<Movie> getTitleComparator() {
        return new Comparator<Movie>() {
            public int compare(Movie m1, Movie m2) {
                String title1 = m1.getTitle().replaceFirst("^(A|An|The)\\s+", "");
                String title2 = m2.getTitle().replaceFirst("^(A|An|The)\\s+", "");
                return title1.compareToIgnoreCase(title2);
            }
        };
    }
}

