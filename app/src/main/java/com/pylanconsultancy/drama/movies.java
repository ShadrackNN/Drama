package com.pylanconsultancy.drama;

public class movies {
    private int id;
    private String title;
    private String shortdesc;
    private double rating;
    private String image;

    public movies(int movie_id, String title, String shortdesc, double rating, String image) {
        this.id = movie_id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public double getRating() {
        return rating;
    }

    public String getImage() {
        return image;
    }
}