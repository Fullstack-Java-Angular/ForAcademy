package com.foracademy.dao.role;

import com.foracademy.dao.DaoUtilities;
import com.foracademy.models.Role;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class RoleDao implements IRoleDao {

    private static final String DELETE_ROLE = "DELETE FROM role WHERE idRole  = ?";
    private static final String UPDATE_ROLE = "UPDATE role SET name = ?,description=? , active = ? WHERE idRole  = ? ";
    private static final String INSERT_ROLE = "INSERT INTO role (name, description, active) VALUES (?, ?, ?)";
    private static final String SELECT_ROLE = "SELECT * FROM role";
    private static final String SELECT_ONE_ROLE = "SELECT * FROM role WHERE idRole  = ?";

    private DaoUtilities.DaoFactory daoFactory;
    public RoleDao(DaoUtilities.DaoFactory daoFactory)
    {
        this.daoFactory=daoFactory;
    }

    @Override
    public int delete(int id) throws SQLException {
        Connection connection = DaoUtilities.DaoFactory.getInstance().getConnection();
        Object[] obj = {id};
        return DaoUtilities.cud(connection,DELETE_ROLE,obj);
    }

    @Override
    public List<Role> findAll() throws SQLException{
        Connection connection = DaoUtilities.DaoFactory.getInstance().getConnection();
        List<Role> roleList = new LinkedList<>();
        ResultSet rs = DaoUtilities.select(connection,SELECT_ROLE);
        while (rs.next()){
            roleList.add(roleFactory.Create(rs));
        }
        return roleList;
    }

    @Override
    public Role findById(int id)throws SQLException {
        Connection connection = DaoUtilities.DaoFactory.getInstance().getConnection();
        Object[] obj = {id};
        ResultSet rs = DaoUtilities.select(connection,SELECT_ONE_ROLE,obj);
        rs.next();
        return roleFactory.Create(rs);
    }

    @Override
    public int insert(Role role)throws SQLException {
        Connection connection = DaoUtilities.DaoFactory.getInstance().getConnection();
        Object[] obj = {role.getName(),role.getDescription(),role.isActive()};
        return DaoUtilities.cud(connection,INSERT_ROLE,obj);
    }

    @Override
    public int update(Role role)throws SQLException {
        Connection connection = DaoUtilities.DaoFactory.getInstance().getConnection();
        Object[] obj = {role.getId(),role.getName(),role.getDescription(),role.isActive()};
        return DaoUtilities.cud(connection,UPDATE_ROLE,obj);
    }
}
