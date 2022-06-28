package com.gmail.aleksandrphilimonov.lesson9.homeworrk;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Processor {

    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) throws Exception {
        try {
            connect();
            dropTableEx();
            buildTable(Cat.class);
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
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void buildTable(Class cl) throws SQLException {
        if (!cl.isAnnotationPresent(Table.class)) {
            throw new RuntimeException("@Table missed");
        }

        Map<Class, String> map = new HashMap<>();
        map.put(int.class, "INTEGER");
        map.put(String.class, "TEXT");

        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        sb.append(((Table) cl.getAnnotation(Table.class)).title())
                .append(" (");
        Field[] fields = cl.getDeclaredFields();
        for (Field f : fields) {
            if (f.isAnnotationPresent(Column.class)) {
                sb.append(f.getName())
                        .append(" ")
                        .append(map.get(f.getType()))
                        .append(", ");
            }
        }
        sb.setLength(sb.length() - 2);
        sb.append(");");
        statement.executeUpdate(sb.toString());

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

    private static void dropTableEx() throws SQLException {
        statement.executeUpdate("DROP TABLE cats");
    }
}
