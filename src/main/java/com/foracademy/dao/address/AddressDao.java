package com.foracademy.dao.address;

import com.foracademy.dao.DaoFactory;
import com.foracademy.dao.DaoUtilities;
import com.foracademy.models.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressDao implements IAddressDao {
    /*
     * Queries Part
     */
    private static final String DELETE_ADDRESS = "DELETE FROM Address WHERE idAddress = ?";
    private static final String UPDATE_ADDRESS = "UPDATE Address SET line = ?, country = ?, region = ?, city = ?, postalCode = ? WHERE idAddress = ? ";
    private static final String INSERT_ADDRESS = "INSERT INTO Address (line, country, region, city, postalCode) VALUES (?, ?, ?, ?, ?)";
    private static final String SELECT_ADDRESS = "SELECT * FROM Address";
    private static final String SELECT_ONE_ADDRESS = "SELECT * FROM Address";

    /*
     * Constructor
     */
    private DaoFactory daoFactory;
    public AddressDao(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    /*
     * Code part
     */
    @Override
    public int delete(int id) throws SQLException {
        Object[] objects = { id };
        Connection connection = DaoFactory.getInstance().getConnection();
        return DaoUtilities.cud(connection, DELETE_ADDRESS, objects);
    }

    @Override
    public List<Address> findAll() throws SQLException {
        List<Address> addressList = new ArrayList<Address>();
        Connection connection = DaoFactory.getInstance().getConnection();
        ResultSet resultSet = DaoUtilities.select(connection, SELECT_ADDRESS);
        while (resultSet.next()) {
           addressList.add(AddressFactory.create(resultSet));
        }
        return addressList;
    }

    @Override
    public Address findById(int id) throws SQLException {
        Connection connection = DaoFactory.getInstance().getConnection();
        ResultSet resultSet = DaoUtilities.select(connection, SELECT_ADDRESS);
        resultSet.next();

        return AddressFactory.create(resultSet);
    }

    @Override
    public int insert(Address address) throws SQLException {
        Object[] objects = {"HELLO", address.getCountry(), address.getRegion(), address.getCity(), address.getPostalCode()};
        Connection connection = DaoFactory.getInstance().getConnection();
        return DaoUtilities.cud(connection, INSERT_ADDRESS, objects);
    }

    @Override
    public int update(Address address) throws SQLException {
        Object[] objects = {"HELLO", address.getCountry(), address.getRegion(), address.getCity(), address.getPostalCode(), address.getId()};
        Connection connection = DaoFactory.getInstance().getConnection();
        return DaoUtilities.cud(connection, UPDATE_ADDRESS, objects);
    }
}
