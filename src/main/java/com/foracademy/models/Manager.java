package com.foracademy.models;

import java.sql.Date;

public class Manager extends User {
    private java.sql.Date dateOfEntryToFactory;

    public Manager(int id, String lastName, String firstName, String email, String password, String phone, String gander, Date dateOfBirth, boolean active, Address address, Role role, Date dateOfEntryToFactory) {
        super(id, lastName, firstName, email, password, phone, gander, dateOfBirth, active, address, role);
        this.dateOfEntryToFactory = dateOfEntryToFactory;
    }

    public Date getDateOfEntryToFactory() {
        return dateOfEntryToFactory;
    }

    public void setDateOfEntryToFactory(Date dateOfEntryToFactory) {
        this.dateOfEntryToFactory = dateOfEntryToFactory;
    }
}
