package com.foracademy.dao.permission;

import com.foracademy.dao.DaoFactory;
import com.foracademy.dao.DaoUtilities;
import com.foracademy.models.Permission;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PermissionDao implements IPermissionDao {

    private static final String DELETE_Permission = "DELETE FROM permission WHERE idPermission = ?";
    private static final String UPDATE_Permission = "UPDATE permission SET name = ?, description = ?, active = ? WHERE idPermission = ? ";
    private static final String INSERT_Permission = "INSERT INTO permission (name, description, active) VALUES (?, ?, ?)";
    private static final String SELECT_Permission = "SELECT * FROM permission";
    private static final String SELECT_ONE_Permission = "SELECT * FROM permission WHERE idPermission = ?";

    private  DaoFactory daoFactory;
    public PermissionDao(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public int delete(int id) throws SQLException {
        Connection connection = daoFactory.getInstance().getConnection();
        Object[] object ={ id };
        return DaoUtilities.cud(connection,DELETE_Permission,object);
    }

    @Override
    public List<Permission> findAll() throws SQLException {
        Connection connection = daoFactory.getInstance().getConnection();
        List<Permission> permissionList = new ArrayList<Permission>();
        ResultSet rs =  DaoUtilities.select(connection,SELECT_Permission);
        while (rs.next()){
            permissionList.add(PermissionFactory.create(rs));
        }
        return permissionList;
    }

    @Override
    public Permission findById(int id) throws SQLException {
        Connection connection = daoFactory.getInstance().getConnection();
        Object[] object = {id};
        ResultSet rs = DaoUtilities.select(connection,SELECT_ONE_Permission,id);
        rs.next();

        return   PermissionFactory.create(rs);
    }

    @Override
    public int insert(Permission permission) throws SQLException {
        Connection connection = daoFactory.getInstance().getConnection();
        Object[] obj ={  permission.getName(), permission.getDescription(), permission.isActive()};
        return DaoUtilities.cud(connection,INSERT_Permission,obj);
    }

    @Override
    public int update(Permission permission) throws SQLException {
        Connection connection = daoFactory.getInstance().getConnection();
        Object [] obj = { permission.getId(),permission.getName(),permission.getDescription(),permission.isActive() };
        return DaoUtilities.cud(connection,UPDATE_Permission,obj);
    }
}
