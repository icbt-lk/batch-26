/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

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
public class DBUtils {
    static final String DB_URL = "jdbc:mysql://localhost:3306/icbt?useSSL=false";
    static final String USER = "root";
    static final String PASS = "root";
    
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM students");
             ) {		      
                while(rs.next()){
                    Student student = new Student();
                    student.setId(rs.getInt("id"));
                    student.setName(rs.getString("name"));
                    student.setDob(rs.getString("dob"));         
                    students.add(student);
                }
             } catch (SQLException e) {
                 System.out.println(e);
             } 
        } catch(SQLException e) {
            System.out.println(e);
        }     
       
        return students;
    }
    
    public Student getStudent(int id) throws Exception {
        Student student = null;
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE id="+ id);
             ) {		      
                while(rs.next()){
                    student = new Student();
                    student.setId(rs.getInt("id"));
                    student.setName(rs.getString("name"));
                    student.setDob(rs.getString("dob"));  
                    break;
                }
             } catch (SQLException e) {
                 System.out.println(e);
                 throw e;
             } 
        } catch(SQLException e) {
            System.out.println(e);
            throw e;
        }     
       
        return student;
    }
    
    public boolean addStudent(Student student) {
          try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
             ) {		      
               stmt.executeUpdate("INSERT INTO students (id, name, dob) "
                       + "VALUES ('" + student.getId() + "', '" + student.getName() + "', '" + student.getDob() +"')");
               return true;
             } catch (SQLException e) {
                 System.out.println(e);
             } 
        } catch(SQLException e) {
            System.out.println(e);
        }     
        return false;
    }
    
    public boolean updateStudent(Student student) {
          try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
             ) {		      
               stmt.executeUpdate("UPDATE students SET name = '" 
                       + student.getName() + "', dob = '" + student.getDob() 
                       + "' WHERE (id = '" + student.getId() + "')");
               return true;
             } catch (SQLException e) {
                 System.out.println(e);
             } 
        } catch(SQLException e) {
            System.out.println(e);
        }     
        return false;
    }
    
    public boolean deleteStudent(int id) {
          try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
             ) {		      
               stmt.executeUpdate("DELETE FROM students WHERE (id = '" + id + "')");
               return true;
             } catch (SQLException e) {
                 System.out.println(e);
             } 
        } catch(SQLException e) {
            System.out.println(e);
        }     
        return false;
    }
}
