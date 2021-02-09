package com.example.nbp;

public class Gold {
    private String date;
    private Double price;

    public Gold(String date, Double price) {
        this.date = date;
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return date + ": " + price;
    }
}
