package com.foracademy.dao.role;

import com.foracademy.models.Role;

import java.sql.ResultSet;
import java.sql.SQLException;

public class roleFactory {
    private roleFactory() {}

    public static Role Create(ResultSet resultSet)throws SQLException{
        Role role = new Role();
        role.setId(resultSet.getInt("idRole"));
        role.setName(resultSet.getString("name"));
        role.setDescription(resultSet.getString("description"));
        role.setActive(resultSet.getBoolean("active"));
        return role;
    }
}
