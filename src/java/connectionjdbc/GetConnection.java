/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hiepnguyen
 */
public class GetConnection {

    private static final String DRIVER = "com.mysql.jdbc.Driver";

    public GetConnection() {
    }

    public static Connection getConnection() {
        final String URL = "jdbc:mysql://localhost:3306/shoes_shop?autoReconnect=true&useSSL=false"
                + "&useUnicode=yes&characterEncoding=UTF-8";
        final String USERNAME = "root";
        final String PASSWORD = "hiepnguyen132";
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GetConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    }
