package com.foracademy.dao.speciality;

import com.foracademy.dao.DaoFactory;
import com.foracademy.dao.DaoUtilities;
import com.foracademy.models.Speciality;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SpecialiyDao implements ISpecialityDao {

    /*
     * Queries Part
     */
    private static final String DELETE_SPECIALITY = "DELETE FROM Speciality WHERE idSpeciality = ?";
    private static final String UPDATE_SPECIALITY = "UPDATE Speciality SET name = ?, description = ? WHERE idSpeciality = ? ";
    private static final String INSERT_SPECIALITY = "INSERT INTO Speciality (name, description) VALUES (?, ?)";
    private static final String SELECT_SPECIALITY = "SELECT * FROM Speciality";
    private static final String SELECT_ONE_SPECIALITY = "SELECT * FROM Speciality WHERE idSpeciality = ?";

    private DaoFactory daoFactory;
    public SpecialiyDao(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public int delete(int id) throws SQLException {
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] objects = { id };
        return DaoUtilities.cud(connection, DELETE_SPECIALITY, objects);
    }

    @Override
    public List<Speciality> findAll() throws SQLException {
        List<Speciality> specialityList = new ArrayList<Speciality>();
        Connection connection = DaoFactory.getInstance().getConnection();
        ResultSet resultSet = DaoUtilities.select(connection, SELECT_SPECIALITY);
        while (resultSet.next()) {
            specialityList.add(SpecialityFactory.create(resultSet));
        }
        return specialityList;
    }

    @Override
    public Speciality findById(int id) throws SQLException {
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] objects = { id };
        ResultSet resultSet = DaoUtilities.select(connection, SELECT_ONE_SPECIALITY, objects);
        resultSet.next();
        return SpecialityFactory.create(resultSet);
    }

    @Override
    public int insert(Speciality speciality) throws SQLException {
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] objects = {speciality.getName(), speciality.getDescription()};
        return DaoUtilities.cud(connection, INSERT_SPECIALITY, objects);
    }

    @Override
    public int update(Speciality speciality) throws SQLException {
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] objects = {speciality.getName(), speciality.getDescription(), speciality.getId()};
        return DaoUtilities.cud(connection, UPDATE_SPECIALITY, objects);
    }
}
