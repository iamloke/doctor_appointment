package edu.divyagyan.main;

import java.sql.*;

public class TestConnection {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydbCrea?createDatabaseIfNotExist=true";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
