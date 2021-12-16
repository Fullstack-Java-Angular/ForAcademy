package com.foracademy.models;

import java.sql.Date;

public class Admin extends User {

    public Admin(int id, String lastName, String firstName, String email, String password, String phone, String gander, Date dateOfBirth, boolean active, Address address, Role role) {
        super(id, lastName, firstName, email, password, phone, gander, dateOfBirth, active, address, role);
    }
}
