/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.test.app;

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
public class MySQLUtilsTest {
    
    public MySQLUtilsTest() {
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
     * Test of getStudents method, of class MySQLUtils.
     */
//    @Test
//    public void testGetStudents() {
//        System.out.println("getStudents");
//        MySQLUtils instance = new MySQLUtils();
//        Student[] expResult = null;
//        Student[] result = instance.getStudents();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getStudent method, of class MySQLUtils.
     */
//    @Test
//    public void testGetStudent() {
//        System.out.println("getStudent");
//        MySQLUtils instance = new MySQLUtils();
//        Student expResult = new Student(99, "John", "1991");
//        Student result = instance.getStudent(expResult.getNo());
//        assertEquals(expResult.getNo(), result.getNo());
//        assertEquals(expResult.getName(), result.getName());
//        assertEquals(expResult.getDob(), result.getDob());
//    }
    
    @Test
    public void testCRUDOperations() {
        System.out.println("testCRUDOperations");
        MySQLUtils instance = new MySQLUtils();
        Student student = new Student(999, "George", "1993");
       
        
        boolean result = instance.addStudent(student);
        assertEquals(true, result);
        
        Student resultStudent = instance.getStudent(student.getNo());
        assertEquals(student.getNo(), resultStudent.getNo());
        assertEquals(student.getName(), resultStudent.getName());
        assertEquals(student.getDob(), resultStudent.getDob());
            
        student = new Student(999, "Jane", "1996");
        result = instance.updateStudent(student);
        assertEquals(true, result);
        
        resultStudent = instance.getStudent(student.getNo());
        assertEquals(student.getNo(), resultStudent.getNo());
        assertEquals(student.getName(), resultStudent.getName());
        assertEquals(student.getDob(), resultStudent.getDob());
        
        result = instance.deleteStudent(student.getNo());
        assertEquals(true, result);
         
        resultStudent = instance.getStudent(student.getNo());
        assertEquals(null, resultStudent);
    }

//    /**
//     * Test of addStudent method, of class MySQLUtils.
//     */
//    @Test
//    public void testAddStudent() {
//        System.out.println("addStudent");
//        Student st = null;
//        MySQLUtils instance = new MySQLUtils();
//        boolean expResult = false;
//        boolean result = instance.addStudent(st);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateStudent method, of class MySQLUtils.
//     */
//    @Test
//    public void testUpdateStudent() {
//        System.out.println("updateStudent");
//        Student st = null;
//        MySQLUtils instance = new MySQLUtils();
//        boolean expResult = false;
//        boolean result = instance.updateStudent(st);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteStudent method, of class MySQLUtils.
//     */
//    @Test
//    public void testDeleteStudent() {
//        System.out.println("deleteStudent");
//        String stNo = "";
//        MySQLUtils instance = new MySQLUtils();
//        boolean expResult = false;
//        boolean result = instance.deleteStudent(stNo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
