package com.foracademy.dao.Secretary;

import com.foracademy.dao.DaoFactory;
import com.foracademy.dao.DaoUtilities;
import com.foracademy.models.Secretary;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SecretaryDao implements ISecretaryDao{
    /*
     * Queries Part
     */
    private static final String DELETE_SECRETARY = "DELETE FROM Secretary WHERE idClass = ?";
    private static final String UPDATE_SECRETARY = "UPDATE Secretary SET dateOfEntryToFactory = ? WHERE idSecretary = ? ";
    private static final String INSERT_SECRETARY = "INSERT INTO Secretary (dateOfEntryToFactory) VALUES (?)";
    private static final String SELECT_SECRETARY = "SELECT * FROM Secretary";
    private static final String SELECT_ONE_SECRETARY = "SELECT * FROM Secretary";

    /*
     * Constructor
     */
    private DaoFactory daoFactory;
    public SecretaryDao(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }


    /*
     * Code part
     */
    @Override
    public int delete(int id) throws SQLException {
        Object[] objects = { id };
        Connection connection = DaoFactory.getInstance().getConnection();
        return DaoUtilities.cud(connection, DELETE_SECRETARY, objects);
    }

    @Override
    public List<Secretary> findAll() throws SQLException {
        List<Secretary> classList = new ArrayList<Secretary>();
        Connection connection = DaoFactory.getInstance().getConnection();
        ResultSet resultSet = DaoUtilities.select(connection, SELECT_SECRETARY );
        while (resultSet.next()) {
            classList.add(SecretaryFactory.create(resultSet));
        }
        return classList;
    }
    @Override
    public Secretary findById(int id) throws SQLException {
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] objects = { id };
        ResultSet resultSet = DaoUtilities.select(connection, SELECT_ONE_SECRETARY, objects);
        resultSet.next();
        return SecretaryFactory.create(resultSet);
    }


    @Override
    public int insert(Secretary secretary) throws SQLException {
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] objects = {secretary.getDateOfEntryToFactory()};
        return DaoUtilities.cud(connection, INSERT_SECRETARY, objects);
    }

    @Override
    public int update(Secretary secretary) throws SQLException {
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] objects = {secretary.getDateOfEntryToFactory(), secretary.getId()};
        return DaoUtilities.cud(connection, UPDATE_SECRETARY, objects);
    }}



