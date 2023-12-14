package com.example.prvypolrok.jdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyConnection {


    public static void main(String[] args) throws SQLException {

        List<UzivatelDto> uzivatelia = new ArrayList<>();
        DBConnection dbCon= DBConnection.getInstance();
        Connection  conn = dbCon.getConnection();

        ResultSet rs
                = conn.createStatement().executeQuery("SELECT * FROM UZIVATELIA"); // Execute query
        while (rs.next()){
            UzivatelDto uzivateliaDTO = new UzivatelDto(rs.getInt("ID"), rs.getString("MENO"),
                    rs.getString("PRIEZVISKO"), rs.getString("ADRESA"));

            uzivatelia.add(uzivateliaDTO);
        }
    }
}