package com.foracademy.dao.Class;

import com.foracademy.dao.DaoFactory;
import com.foracademy.dao.DaoUtilities;
import com.foracademy.models.Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassDao implements IClassDao {
    /*
     * Queries Part
     */
    private static final String DELETE_CLASS = "DELETE FROM Class WHERE idClass = ?";
    private static final String UPDATE_CLASS = "UPDATE Class SET name = ?, idTrainer = ?, idPromotion = ?, startDay = ?, endDay = ? WHERE idClass = ? ";
    private static final String INSERT_CLASS = "INSERT INTO Class (name, idTrainer, idPromotion, startDay, endDay) VALUES (?, ?, ?, ?, ?)";
    private static final String SELECT_CLASS = "SELECT * FROM Class";
    private static final String SELECT_ONE_CLASS = "SELECT * FROM Class";

    /*
     * Constructor
     */
    private DaoFactory daoFactory;
    public ClassDao(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    /*
     * Code part
     */
    @Override
    public int delete(int id) throws SQLException {
        Object[] objects = { id };
        Connection connection = DaoFactory.getInstance().getConnection();
        return DaoUtilities.cud(connection, DELETE_CLASS, objects);
    }

    @Override
    public List<Class> findAll() throws SQLException {
        List<Class> classList = new ArrayList<Class>();
        Connection connection = DaoFactory.getInstance().getConnection();
        ResultSet resultSet = DaoUtilities.select(connection, SELECT_CLASS );
        while (resultSet.next()) {
            classList.add(ClassFactory.create(resultSet));
        }
        return classList;
    }
    @Override
    public Class findById(int id) throws SQLException {
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] objects = { id };
        ResultSet resultSet = DaoUtilities.select(connection, SELECT_ONE_CLASS, objects);
        resultSet.next();
        return ClassFactory.create(resultSet);
    }

    @Override
    public int insert(Class aClass) throws SQLException {
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] objects = {aClass.getName(), aClass.getTrainer(), aClass.getPromotion(), aClass.getStartDay(), aClass.getEndDay()};
        return DaoUtilities.cud(connection, INSERT_CLASS, objects);
    }

    @Override
    public int update(Class aClass) throws SQLException {
        Connection connection = DaoFactory.getInstance().getConnection();
        Object[] objects = {aClass.getName(), aClass.getTrainer(), aClass.getPromotion(), aClass.getStartDay(), aClass.getEndDay(), aClass.getId()};
        return DaoUtilities.cud(connection, UPDATE_CLASS, objects);
    }}
