package main.java.cinema;


public class Movie {
    private String name;
    private String genre;
    private Double price;

    Movie(String name, String genre, Double price) {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
