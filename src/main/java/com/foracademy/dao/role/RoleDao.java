package com.foracademy.dao.role;

import com.foracademy.models.Role;

import java.util.List;

public interface RoleDao {
    public int delete(int id);
    public List<Role> findAll();
    public Role findById(int id);
    public int insert(Role role);
    public int update(Role role);
}
