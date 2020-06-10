/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class DatabaseHelper {
    public static Connection c;
    public static Statement s;
    static{
        try{// Load the driver 
        Class.forName("com.mysql.jdbc.Driver");

        // Create the connection
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb", "root", "zaid");

        // Create Statement
        s = c.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
