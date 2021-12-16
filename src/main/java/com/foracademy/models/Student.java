package com.foracademy.models;

import java.sql.Date;

public class Student extends User {
    private Speciality speciality;
    private Class aClass;

    public Student(int id, String lastName, String firstName, String email, String password, String phone, String gander, Date dateOfBirth, boolean active, Address address, Role role, Speciality speciality, Class aClass) {
        super(id, lastName, firstName, email, password, phone, gander, dateOfBirth, active, address, role);
        this.speciality = speciality;
        this.aClass = aClass;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }
}
