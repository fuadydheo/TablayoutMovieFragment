package com.example.fragmentmoviecatalogue.model;

public class TvShow {
    private String name;
    private String detail;
    private int photo;

    public TvShow() {
    }

    public TvShow(String name, String detail, int photo) {
        this.name = name;
        this.detail = detail;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public int getPhoto() {
        return photo;
    }

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
