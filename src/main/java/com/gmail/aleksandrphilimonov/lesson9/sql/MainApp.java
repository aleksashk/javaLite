package com.gmail.aleksandrphilimonov.lesson9.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {
    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) throws Exception {
        try {
            connect();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            statement = connection.createStatement();
        } catch (SQLException | ClassNotFoundException e) {
            throw new SQLException("Unable to connect");
        }
    }

    public static void disconnect() {
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



























