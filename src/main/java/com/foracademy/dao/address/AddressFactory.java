package com.foracademy.dao.address;

import com.foracademy.models.Address;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressFactory {
    private AddressFactory() { }

    public static Address create(ResultSet resultSet) throws SQLException {
        Address address = new Address();
        address.setId(resultSet.getInt("idAddress"));
        address.setCountry(resultSet.getString("country"));
        address.setRegion(resultSet.getString("region"));
        address.setCity(resultSet.getString("city"));
        address.setPostalCode(resultSet.getString("postalCode"));
        return address;
    }
}
