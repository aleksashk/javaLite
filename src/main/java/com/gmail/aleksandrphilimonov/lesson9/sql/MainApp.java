package com.gmail.aleksandrphilimonov.lesson9.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class MainApp {
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement("INSERT INTO students(name, score) VALUES (?,?);");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
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

    public static void main(String[] args) throws Exception {
        try {
            connect();
            clearTableEx();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }

    }

    private static void rollBackEx() throws SQLException {
        statement.executeUpdate("INSERT INTO students(name, score) VALUES ('Bob1', 80);");
        Savepoint sp1 = connection.setSavepoint();
        statement.executeUpdate("INSERT INTO students(name, score) VALUES ('Bob2', 80);");
        connection.rollback(sp1);
        statement.executeUpdate("INSERT INTO students(name, score) VALUES ('Bob3', 80);");
        connection.commit();
    }

    private static void batchEx() throws SQLException {
        connection.setAutoCommit(false);
        for (int i = 0; i < 10000; i++) {
            preparedStatement.setString(1, "Bob" + (i + 1));
            preparedStatement.setInt(2, 50);
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
        connection.commit();
    }

    private static void transactionAndPreparedStatementEx() throws SQLException {
        connection.setAutoCommit(false);
        for (int i = 0; i < 10000; i++) {
            preparedStatement.setString(1, "Bob" + (i + 1));
            preparedStatement.setInt(2, 50);
            preparedStatement.executeUpdate();
        }
        connection.commit();
    }

    private static int dropEx() throws SQLException {
        return statement.executeUpdate("DROP TABLE students;");
    }

    private static void clearTableEx() throws SQLException {
        statement.executeUpdate("DELETE FROM students");
    }

    private static void deleteEx() throws SQLException {
        statement.executeUpdate("DELETE FROM students WHERE id = 3");
    }

    private static void updateEx() throws SQLException {
        statement.executeUpdate("UPDATE students SET score = 80 WHERE id = 1;");
    }

    private static void selectEx() {
        try (ResultSet rs = statement.executeQuery("SELECT * FROM students;")) {
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getInt(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void insertEx() throws SQLException {
        statement.executeUpdate("INSERT INTO students(name, score) VALUES ('Bob3', 80);");
    }
}



























