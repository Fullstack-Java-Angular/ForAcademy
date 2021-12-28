package com.foracademy.models;

public class Permission {
    private int id;
    private String name;
    private String description;
    private boolean active;

    public Permission() {

    }

    public int getId() {
        return id;
    }

    public void setIdPermission(int idPermission) {
        this.id = idPermission;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}
