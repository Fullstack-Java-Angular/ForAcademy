package com.foracademy.models;

import java.sql.Date;

public class Scan {
    private Scan scan;
    private Ssica ssica;
    private User user;
    private java.sql.Date arrivalDate;
    private java.sql.Date goDate;

    public Scan(Scan scan, Ssica ssica, User user, Date arrivalDate, Date goDate) {
        this.scan = scan;
        this.ssica = ssica;
        this.user = user;
        this.arrivalDate = arrivalDate;
        this.goDate = goDate;
    }

    public Scan getScan() {
        return scan;
    }

    public void setScan(Scan scan) {
        this.scan = scan;
    }

    public Ssica getSsica() {
        return ssica;
    }

    public void setSsica(Ssica ssica) {
        this.ssica = ssica;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getGoDate() {
        return goDate;
    }

    public void setGoDate(Date goDate) {
        this.goDate = goDate;
    }

    @Override
    public String toString() {
        return "Scan{" +
                "scan=" + scan +
                ", ssica=" + ssica +
                ", user=" + user +
                ", arrivalDate=" + arrivalDate +
                ", goDate=" + goDate +
                '}';
    }
}
