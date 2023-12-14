package com.example.prvypolrok.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    private String DB_URL = "jdbc:h2:tcp://localhost/C:\\Java\\TPI4-2023-2024\\mojadb";
    private String USER = "sa";
    private String PASS = "sa";
    private Statement stmt;

    private DBConnection(){

    }

    public static DBConnection databaseCon;

    public static DBConnection getInstance(){
        if(databaseCon == null){
            return new DBConnection();
        }else{
            return databaseCon;
        }
    }
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}