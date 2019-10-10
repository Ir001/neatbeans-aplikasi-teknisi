/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teknisi;

import java.sql.*;

/**
 *
 * @author user
 */
public class koneksi {
    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException {
        try {
            String url="jdbc:mysql://localhost:3306/teknisiku";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url,user,pass);
        }
        catch ( Exception e ) {
            System.err.println("Koneksi Gagal" + e.getMessage());
        }
        return mysqlconfig;
    }
}
