/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabshot.management.system.DBA;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vijay P Khatri
 */
public class DBConnection {
    static Connection con=null;
    
    public static Connection makeConnection(){
        if(con==null){
            con=getConnection();
            return con;
        }
        return con;
    }

    private static Connection getConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:shop.db");
            System.out.println("Open Connection");
        } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        return con;
    }
    
    /*public static void main(String arg[]) {
        DBConnection.makeConnection();
    }*/
}
