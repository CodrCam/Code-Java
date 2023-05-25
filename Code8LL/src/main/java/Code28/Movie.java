package Code28;

import java.util.List;

public class Movie {
    private String title;
    private int year;
    private List<String> genres;

    public Movie(String title, int year, List<String> genres) {
        this.title = title;
        this.year = year;
        this.genres = genres;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public List<String> getGenres() {
        return this.genres;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
}
