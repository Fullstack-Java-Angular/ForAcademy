package com.foracademy.dao;


import java.sql.*;

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

    public static void disconnect(Connection connection) throws SQLException {
        if (!connection.isClosed()) connection.close();
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
}
