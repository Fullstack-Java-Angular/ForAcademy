package com.foracademy.console;

import com.foracademy.dao.DaoFactory;
import com.foracademy.dao.address.AddressDao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class App {

    public static void main(String[] args) throws IOException {
        System.out.println("HELLO FROM CONSOLE APP");
        AddressDao addressDao = DaoFactory.getInstance().getAddressDao();
        try {
            addressDao.delete(23);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
