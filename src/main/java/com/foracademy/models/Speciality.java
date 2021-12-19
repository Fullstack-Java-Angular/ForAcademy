package com.foracademy.models;

public class Speciality {
    private int idSpeciality;
    private String name;
    private String description;

    public Speciality(int id, String name, String description) {
        this.idSpeciality = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return idSpeciality;
    }

    public void setId(int id) {
        this.idSpeciality = id;
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

    @Override
    public String toString() {
        return "Speciality{" +
                "id=" + idSpeciality +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
