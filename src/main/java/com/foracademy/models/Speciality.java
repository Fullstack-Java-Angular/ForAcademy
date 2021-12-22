package com.foracademy.models;

public class Speciality {
    private long id;
    private String name;
    private String description;

<<<<<<< HEAD
    public Speciality(){

    }

    public Speciality(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
=======
    public Speciality() { }
>>>>>>> 0f8f383461608f56903ce6a233297d7378ae14e5

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
