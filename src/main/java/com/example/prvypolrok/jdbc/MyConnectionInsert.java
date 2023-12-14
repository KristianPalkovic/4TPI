package com.example.prvypolrok.jdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyConnectionInsert {


    public static void main(String[] args) {

        String DB_URL = "jdbc:h2:tcp://localhost/C:\\Java\\TPI4-2023-2024\\mojadb";
        String USER = "sa";
        String PASS = "sa";
        Statement stmt = null;
        Connection conn;
        List<UzivatelDto> uzivatelia = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            stmt.execute("INSERT INTO UZIVATELIA(ID,MENO,PRIEZVISKO,ADRESA)" +
                    "VALUES(4,'STVRTE MENO','STVRTE PRIEZVISKO','STVRTA ADRESA');"); // execute query

            stmt.close(); // close statement
            conn.close(); // close connection
        } catch (SQLException ex) {

        }
    }
}