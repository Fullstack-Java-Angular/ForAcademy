package com.foracademy.dao.rolePermission;

import com.foracademy.models.RolePermission;

import java.util.List;

public interface RolePermissionDao {
    public int delete(int id);
    public List<RolePermission> findAll();
    public RolePermission findById(int id);
    public int insert(RolePermission rolePermission);
    public int update(RolePermission rolePermission);
}
