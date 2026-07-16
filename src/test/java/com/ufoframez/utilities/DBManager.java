package com.ufoframez.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    private static Connection connection;

    private static final String URL = "jdbc:sqlserver://10.1.5.47:1533;databaseName=Temp_DB";
    private static final String USER = "sa";
    private static final String PASSWORD = "qwerty@4321";

    // Create Connection
    public static void connect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("DB Connected");

        } catch (Exception e) {
            System.out.println("DB Connection Failed");
            e.printStackTrace();
        }
    }

    // Get Connection
    public static Connection getConnection() {
        return connection;
    }

    // Close Connection
    public static void disconnect() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("DB Disconnected");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}