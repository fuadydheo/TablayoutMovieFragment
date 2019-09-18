package com.example.fragmentmoviecatalogue.model;

public class Movie {
    private String name;
    private String detail;
    private int photo;

    //TODO membuat contructor

    public Movie() {
    }

    //TODO membuat contructor beserta parameter
    public Movie(String name, String detail, int photo) {
        this.name = name;
        this.detail = detail;
        this.photo = photo;
    }

    //TODO getter


    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public int getPhoto() {
        return photo;
    }

    //TODO setter


    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
