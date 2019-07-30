package main.java.cinema;


class Movie {
    private String name;
    private String genre;
    private Double price;

    Movie(String name, String genre, Double price) {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    String getGenre() {
        return genre;
    }

    Double getPrice() {
        return price;
    }
}
