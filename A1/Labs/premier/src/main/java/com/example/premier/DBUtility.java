package com.example.premier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtility {
    // Database connection URL for the Premier League Stats database
    private static final String URL = "jdbc:mysql://localhost:3306/PremierLeagueStats";
    // Database username
    private static final String USER = "root";
    // Database password
    private static final String PASSWORD = "1234";

    // Method to establish a connection to the database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Method to retrieve season statistics from a specific table, ordered by points in descending order
    public static ResultSet getSeasonStats(String tableName) throws SQLException {
        // Establish a connection to the database
        Connection conn = getConnection();
        // Create a statement to execute SQL queries
        Statement stmt = conn.createStatement();
        // Execute a query to select all records from the specified table, ordered by points in descending order
        return stmt.executeQuery("SELECT * FROM " + tableName + " ORDER BY Points DESC");
    }

    // Method to close database resources (connection, statement, and result set)
    public static void closeResources(Connection conn, Statement stmt, ResultSet rs) {
        try {
            // Close the ResultSet if it's not null
            if (rs != null) rs.close();
            // Close the Statement if it's not null
            if (stmt != null) stmt.close();
            // Close the Connection if it's not null
            if (conn != null) conn.close();
        } catch (SQLException e) {
            // Print the stack trace if there's an SQLException
            e.printStackTrace();
        }
    }
}
