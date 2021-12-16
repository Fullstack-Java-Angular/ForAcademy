package com.foracademy.models;

import java.sql.Time;

public class Class {
    private int id;
    private String name;
    private Trainer trainer;
    private Promotion promotion;
    private Time startDay;
    private Time endDay;

    public Class(int id, String name, Trainer trainer, Promotion promotion, Time startDay, Time endDay) {
        this.id = id;
        this.name = name;
        this.trainer = trainer;
        this.promotion = promotion;
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public Time getStartDay() {
        return startDay;
    }

    public void setStartDay(Time startDay) {
        this.startDay = startDay;
    }

    public Time getEndDay() {
        return endDay;
    }

    public void setEndDay(Time endDay) {
        this.endDay = endDay;
    }
}
