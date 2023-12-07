package com.example.prvypolrok.jvdc;
import java.sql.*;

public class MyConnection {
    public static void main(String[] args) throws SQLException {

        String DB_URL = "jdbc:h2:tcp://localhost/C:\\Java\\TPI4-2023-2024\\mojadb";
        String USER = "sa";
        String PASS = "sa";
        Statement stmt;

        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT + FROM UZIVATELIA");
        rs.next();
        String name = rs.getString("ID");

    }
}
