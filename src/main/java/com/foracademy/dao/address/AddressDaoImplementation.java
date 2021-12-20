package com.foracademy.dao.address;

import com.foracademy.dao.DaoFactory;
import com.foracademy.models.Address;

import java.sql.SQLException;
import java.util.List;

public class AddressDaoImplementation implements AddressDao {
    /*
     * Queries Part
     */
    private static final String DELETE_ADDRESS = "";
    private static final String UPDATE_ADDRESS = "";

    /*
     * Constructor
     */
    private DaoFactory daoFactory;
    public AddressDaoImplementation(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    /*
     * Code part
     */
    @Override
    public int delete(int id) throws SQLException {
        return 0;
    }

    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public Address findById(int id) {
        return null;
    }

    @Override
    public int insert(Address address) {
        return 0;
    }

    @Override
    public int update(Address address) {
        return 0;
    }
}
