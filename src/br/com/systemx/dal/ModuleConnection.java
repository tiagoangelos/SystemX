package br.com.systemx.dal;

import java.sql.*;

public class ModuleConnection {
    public static Connection conector() {
        java.sql.Connection connect = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        
        String url = "jdbc:mysql://127.0.0.1:3306/dbsystemx";
        String user = "root";
        String password = "007201899";
        
        try {
            Class.forName(driver);
            connect = DriverManager.getConnection(url, user, password);
            return connect;
        } catch (Exception ex) {
            return null;
        }
    }   
}