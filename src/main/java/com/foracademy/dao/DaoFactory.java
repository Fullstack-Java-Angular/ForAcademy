package com.foracademy.dao;

import com.foracademy.dao.Class.ClassDao;
import com.foracademy.dao.Class.ClassDaoImplementation;
import com.foracademy.dao.Promotion.PromotionDao;
import com.foracademy.dao.address.IAddressDao;
import com.foracademy.dao.address.AddressDao;
import com.foracademy.dao.factory.FactoryDao;
import com.foracademy.dao.factory.FactoryDaoImplementation;
import com.foracademy.dao.permission.PermissionDao;
import com.foracademy.dao.role.RoleDao;
import com.foracademy.dao.speciality.SpecialiyDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DaoFactory {
    private String url;
    private String username;
    private String password;

    private DaoFactory( String url, String username, String password ) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DaoFactory getInstance() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/dao.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String _url = properties.getProperty("DATABASE_URL");
        String _username = properties.getProperty("USERNAME");
        String _password = properties.getProperty("PASSWORD");

        return new DaoFactory(_url, _username, _password);
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.username, this.password);
    }

    public IAddressDao getAddressDao() {
        return new AddressDao(this);
    }

    public SpecialiyDao getSpeciality() {
        return new SpecialiyDao(this);
    }

    public PermissionDao getPermissionDao() {
        return new PermissionDao(this);
    }

    public PromotionDao getPromotionDao(){ return  new PromotionDao(this);}

    public RoleDao getRoleDao(){ return  new RoleDao(this); }

}
