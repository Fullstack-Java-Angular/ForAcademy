package com.foracademy.models;

import java.sql.Date;

public class Scan {
    private int id;
    private int idSsica;
    private int idUser;
    private Date arrivalDate;
    private Date goDate;

    public Scan() { }


    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getIdSsica() {return idSsica;}

    public void setIdSsica(int idSsica) {this.idSsica = idSsica;}

    public int getIdUser() {return idUser;}

    public void setIdUser(int idUser) {this.idUser = idUser;}

    public Date getArrivalDate() {return arrivalDate;}

    public void setArrivalDate(Date arrivalDate) {this.arrivalDate = arrivalDate;}

    public Date getGoDate() {return goDate;}

    public void setGoDate(Date goDate) {this.goDate = goDate;}
}
