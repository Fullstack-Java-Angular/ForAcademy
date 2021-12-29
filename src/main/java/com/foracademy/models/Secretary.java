package com.foracademy.models;

import java.sql.Date;

public class Secretary extends User {
    private int id;
    //private int idUser;
    //private String lastName;
    //private String firstName;
    //private String email;
    //private String password;
    //private String phone;
    //private String gender;
    //private Date dateOfBirth;
    //private int idAddress;
    //private Boolean active;
    //private int idRole;
    private Date dateOfEntryToFactory;

    public Secretary() {
        super();
    }


    @Override
    public int getId() {return id;}

    @Override
    public void setId(int id) {this.id = id;}

    //public int getIdUser() {return idUser;}

    //public void setIdUser(int idUser) {this.idUser = idUser;}

    //@Override
    //public String getLastName() {return lastName;}

    //@Override
    //public void setLastName(String lastName) {this.lastName = lastName;}

    //@Override
    //public String getFirstName() {return firstName;}

    //@Override
    //public void setFirstName(String firstName) {this.firstName = firstName;}

    //@Override
    //public String getEmail() {return email;}

    //@Override
    //public void setEmail(String email) {this.email = email;}

    //@Override
    //public String getPassword() {return password;}

    //@Override
    //public void setPassword(String password) {this.password = password;}

    //@Override
    //public String getPhone() {return phone;}

    //@Override
    //public void setPhone(String phone) {this.phone = phone;}

    //public String getGender() {return gender;}

    //public void setGender(String gender) {this.gender = gender;}

    //@Override
    //public Date getDateOfBirth() {return dateOfBirth;}

    //@Override
    //public void setDateOfBirth(Date dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    //public int getIdAddress() {return idAddress;}

    //public void setIdAddress(int idAddress) {this.idAddress = idAddress;}

    //public Boolean getActive() {return active;}

    //public void setActive(Boolean active) {this.active = active;}

    //public int getIdRole() {return idRole;}

    //public void setIdRole(int idRole) {this.idRole = idRole;}

    public Date getDateOfEntryToFactory() {return dateOfEntryToFactory;}

    public void setDateOfEntryToFactory(Date dateOfEntryToFactory) {this.dateOfEntryToFactory = dateOfEntryToFactory;}
}
