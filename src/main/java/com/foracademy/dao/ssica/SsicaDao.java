package com.foracademy.dao.ssica;

import com.foracademy.dao.DaoUtilities;
import com.foracademy.models.Ssica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SsicaDao implements ISsicaDao {
    /*
     * Queries Part
     */
    private static final String DELETE_SSICA = "DELETE FROM Ssica WHERE idSsica = ?";
    private static final String UPDATE_SSICA = "UPDATE Ssica SET brand = ? WHERE idSsica= ? ";
    private static final String INSERT_SSICA = "INSERT INTO Ssica (brand) VALUES (?)";
    private static final String SELECT_SSICA = "SELECT * FROM Ssica";
    private static final String SELECT_ONE_SSICA = "SELECT * FROM Ssica WHERE idSsica = ?";

    private DaoUtilities.DaoFactory daoFactory;
    public SsicaDao(DaoUtilities.DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public int delete(int id) throws SQLException {
        Connection connection = daoFactory.getInstance().getConnection();
        Object[] objects = { id };
        return DaoUtilities.cud(connection, DELETE_SSICA, objects);
    }

    @Override
    public List<Ssica> findAll() throws SQLException {
        List<Ssica> ssicaList = new ArrayList<Ssica>();
        Connection connection = daoFactory.getInstance().getConnection();
        ResultSet resultSet = DaoUtilities.select(connection, SELECT_SSICA);
        while (resultSet.next()) {
            ssicaList.add(SsicaFactory.create(resultSet));
        }
        return ssicaList;
    }

    @Override
    public Ssica findById(int id) throws SQLException {
        Connection connection = DaoUtilities.DaoFactory.getInstance().getConnection();
        Object[] objects = { id };
        ResultSet resultSet = DaoUtilities.select(connection, SELECT_ONE_SSICA, objects);
        resultSet.next();
        return SsicaFactory.create(resultSet);
    }

    @Override
    public int insert(Ssica ssica) throws SQLException {
        Connection connection = DaoUtilities.DaoFactory.getInstance().getConnection();
        Object[] objects = {ssica.getBrand()};
        return DaoUtilities.cud(connection, INSERT_SSICA, objects);
    }


    @Override
    public int update(Ssica ssica) throws SQLException {
        Connection connection = DaoUtilities.DaoFactory.getInstance().getConnection();
        Object[] objects = {ssica.getBrand(), ssica.getId()};
        return DaoUtilities.cud(connection, UPDATE_SSICA, objects);
    }}

