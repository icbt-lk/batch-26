/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hnd
 */
public class MySQLUtils implements DBUtil {
    static final String DB_URL = "jdbc:mysql://localhost:3306/icbt";
    static final String USER = "root";
    static final String PASS = "root";
    Connection conn;
    
    public MySQLUtils() {
        try {
         conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch(SQLException e) {
             System.out.println("Cannot be connected to MySQL Server" + e);
        } 
    }
    
    
    
    
    @Override
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");		      
            while(rs.next()){
                Student st = new Student();
                st.setNo(rs.getInt("id"));
                st.setName(rs.getString("name"));
                st.setDob(rs.getString("dob"));
                students.add(st);
            }
        } catch(SQLException e) {
            System.out.println("Error occurrd while reading " + e);
        }
        return students;
    }

    @Override
    public Student getStudent(int stNo) {
        Student st = null;
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE id=" + stNo);		      
            while(rs.next()){
                st = new Student();
                st.setNo(rs.getInt("id"));
                st.setName(rs.getString("name"));
                st.setDob(rs.getString("dob"));
                return st;
            }
        } catch(SQLException e) {
            System.out.println("Error occurrd while reading " + e);
        }
        return st;
    }

    @Override
    public boolean addStudent(Student st) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO students (id, name, dob)"
                    + " VALUES ('" + st.getNo() + "', '" + st.getName() + "', '" + st.getDob()+ "')");
            return true;
        } catch(SQLException e) {
            System.out.println("Error occurrd while adding " + e);
            return false;
        }
    }

    @Override
    public boolean updateStudent(Student st) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(
                    "UPDATE students SET name = '" + st.getName() 
                            + "', dob = '" + st.getDob() 
                            + "' WHERE (id = '" + st.getNo() +  "')");
            return true;
        } catch(SQLException e) {
            System.out.println("Error occurrd while updating " + e);
            return false;
        }
    }

    @Override
    public boolean deleteStudent(int stNo) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(
                    "DELETE FROM students WHERE (`id` = '"+ stNo +"');");
            return true;
        } catch(SQLException e) {
            System.out.println("Error occurrd while deleting " + e);
            return false;
        }
    }
}
