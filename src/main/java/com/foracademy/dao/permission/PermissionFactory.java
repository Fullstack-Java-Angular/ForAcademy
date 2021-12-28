package com.foracademy.dao.permission;

import com.foracademy.models.Permission;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PermissionFactory {

    private PermissionFactory(){}

    public static Permission create(ResultSet resultSet) throws SQLException {
        Permission permission = new Permission();
        permission.setIdPermission(resultSet.getInt("idPermission"));
        permission.setName(resultSet.getString("name"));
        permission.setDescription(resultSet.getString("description"));
        permission.setDescription(resultSet.getString("active"));

        return permission;
    }

}
