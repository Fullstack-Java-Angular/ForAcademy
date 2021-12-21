package com.foracademy.dao;

import java.sql.*;

public class Database {

    // Database constants
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_NAME = "FORACADEMY";
    private static final String DATABASE_URL = String.format("jdbc:mysql://localhost:3306/%s", DATABASE_NAME);
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String MAX_POOL = "250";

    private Connection connection;
    private Statement statement;

    public Connection connect() {
        try {
            this.connection = (Connection) DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("you are connect ");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;

    }

    public void disconnect() throws SQLException {
        if (!this.connection.isClosed()) {
            try {
                this.connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public ResultSet select(String query) throws SQLException {
        this.statement = connection.createStatement();
        ResultSet resultSet = this.statement.executeQuery(query);

        return resultSet;
    }

    public int cud(String query) throws SQLException {
        this.statement = this.connection.createStatement();
        int result = this.statement.executeUpdate(query);

        return result;
    }

}
