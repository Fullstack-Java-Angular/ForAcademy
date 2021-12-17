package com.foracademy.dao.permission;

import com.foracademy.models.Permission;

import java.util.List;

public interface PermissionDao {
    public int delete(int id);
    public List<Permission> findAll();
    public Permission findById(int id);
    public int insert(Permission permission);
    public int update(Permission permission);
}
