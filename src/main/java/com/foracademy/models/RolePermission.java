package com.foracademy.models;

import java.sql.Date;

public class RolePermission {
    private int id;
    private Role role;
    private Permission permission;
    private Date assignedAt;
    private Date updatedAt;

    public RolePermission(int id, Role role, Permission permission, Date assignedAt, Date updatedAt) {
        this.id = id;
        this.role = role;
        this.permission = permission;
        this.assignedAt = assignedAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public Date getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(Date assignedAt) {
        this.assignedAt = assignedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
