/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package db;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hnd
 */
public class DBUtilsTest {
    
    public DBUtilsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addStudent method, of class DBUtils.
     */
    @Test
    public void testCRUDOperations() {
        System.out.println("testCRUDOperations");
    
        Student student = new Student(999, "George", "1993");
       
        DBUtils instance = new DBUtils();
        
        boolean result = instance.addStudent(student);
        assertEquals(true, result);
        
        Student resultStudent = instance.getStudent(student.getId());
        assertEquals(student.getId(), resultStudent.getId());
        assertEquals(student.getName(), resultStudent.getName());
        assertEquals(student.getDob(), resultStudent.getDob());
            
        student = new Student(999, "Jane", "1996");
        result = instance.updateStudent(student);
        assertEquals(true, result);
        
        resultStudent = instance.getStudent(student.getId());
        assertEquals(student.getId(), resultStudent.getId());
        assertEquals(student.getName(), resultStudent.getName());
        assertEquals(student.getDob(), resultStudent.getDob());
        
        result = instance.deleteStudent(student.getId());
        assertEquals(true, result);
         
        resultStudent = instance.getStudent(student.getId());
        assertEquals(null, resultStudent);
        
        
    }

    
}
