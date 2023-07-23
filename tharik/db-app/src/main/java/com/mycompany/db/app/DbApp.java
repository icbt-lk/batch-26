/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.db.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hnd
 */
public class DbApp {
    static final String DB_URL = "jdbc:mysql://localhost:3306/icbt";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT * FROM students";
    
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
      ) {		      
         while(rs.next()){
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("DOB: " + rs.getString("dob"));
            System.out.println("*************************************");
         }
      } catch (SQLException e) {
          System.out.println(e);
      } 
    }
}
