package com.foracademy.models;

import java.sql.Date;

public class Trainer extends User {
    public Speciality speciality;


    public Trainer(int id, String lastName, String firstName, String email, String password, String phone, String gander, Date dateOfBirth, boolean active, Address address, Role role, Speciality speciality) {
        super(id, lastName, firstName, email, password, phone, gander, dateOfBirth, active, address, role);
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
