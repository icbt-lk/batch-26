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
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int no1 = 2;
        int no2 = 3;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.add(no1, no2);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int no1 = 8;
        int no2 = 3;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.subtract(no1, no2);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int no1 = 12;
        int no2 = 3;
        Calculator instance = new Calculator();
        int expResult = 4;
        int result = instance.divide(no1, no2);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int no1 = 5;
        int no2 = 6;
        Calculator instance = new Calculator();
        int expResult = 30;
        int result = instance.multiply(no1, no2);
        assertEquals(expResult, result);
    }
    
}
