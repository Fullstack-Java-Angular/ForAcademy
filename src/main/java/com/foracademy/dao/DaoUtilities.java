package com.foracademy.dao;


import com.foracademy.dao.Promotion.PromotionDao;
import com.foracademy.dao.address.AddressDao;
import com.foracademy.dao.address.IAddressDao;
import com.foracademy.dao.permission.PermissionDao;
import com.foracademy.dao.role.RoleDao;
import com.foracademy.dao.speciality.SpecialiyDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DaoUtilities {
    public static PreparedStatement preparedStatement(Connection connection, String query, Object... objects) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(query);
        for (int i = 0; i < objects.length; i++) {
            ps.setObject(i+1, objects[i]);
        }
        return ps;
    }

    public static ResultSet select(Connection connection, String query, Object... objects) throws SQLException {
        return preparedStatement(connection, query, objects).executeQuery();
    }

    public static ResultSet select(Connection connection, String query) throws SQLException {
        return preparedStatement(connection, query).executeQuery();
    }

    public static int cud(Connection connection, String query, Object... objects) throws SQLException {
        return preparedStatement(connection, query, objects).executeUpdate();
    }

    public static void close( ResultSet resultSet ) {
        if ( resultSet != null ) {
            try {
                resultSet.close();
            } catch ( SQLException e ) {
                System.out.println( "Failed to close ResultSet : " + e.getMessage() );
            }
        }
    }

    public static void close( Statement statement ) {
        if ( statement != null ) {
            try {
                statement.close();
            } catch ( SQLException e ) {
                System.out.println( "Failed to close Statement : " + e.getMessage() );
            }
        }
    }

    public static void close( Connection connection ) {
        if ( connection != null ) {
            try {
                connection.close();
            } catch ( SQLException e ) {
                System.out.println( "Failed to close connection : " + e.getMessage() );
            }
        }
    }

    public static void close( Statement statement, Connection connection ) {
        close( statement );
        close( connection );
    }

    public static void close(ResultSet resultSet, Statement statement, Connection connection ) {
        close( resultSet );
        close( statement );
        close( connection );
    }

    public static class DaoFactory {
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

        public SpecialiyDao getSpecialityDao() { return  new SpecialiyDao(this); }
    }
}
