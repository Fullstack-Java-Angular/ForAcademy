package com.foracademy.models;

public class Ssica {
    private int id;
    private String brand;

    public Ssica(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Ssica{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
