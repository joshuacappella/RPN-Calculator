/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.joshuacappella.rpn.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Joshua Cappella
 */
public class computeTest {
    
    public computeTest() {
    }

    /**
     * Test of addition in compute method, of class compute.
     */
    @org.junit.jupiter.api.Test
    public void testAddition() {
        System.out.println("add");
        String args = "3 2.7 +";
        double expResult = 5.7;
        double result = compute.compute(args);
        assertEquals(expResult, result, 0);
    }
    
     /**
     * Test of subtraction in compute method, of class compute.
     */
    @org.junit.jupiter.api.Test
    public void testSubtraction(){
        System.out.println("subtract");
        String args = "3 2.7 -";
        double expResult = 0.3;
        double result = compute.compute(args);
        assertEquals(expResult, result, 0.0000001);
    }
    
     /**
     * Test of multiplication in compute method, of class compute.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplication(){
        System.out.println("multiplication");
        String args = "3 2.7 *";
        double expResult = 8.1;
        double result = compute.compute(args);
        assertEquals(expResult, result, 0.0000001);
    }
    
     /**
     * Test of division in compute method, of class compute.
     */
    @org.junit.jupiter.api.Test
    public void testDivision(){
        System.out.println("division");
        String args = "2.7 -3 /";
        double expResult = -0.9;
        double result = compute.compute(args);
        assertEquals(expResult, result, 0.0000001);
    }
    
     /**
     * Test of division by zero in compute method, of class compute.
     * NOT WORKING, PERHAPS SOMETHING WITH DELTA
     */
    @org.junit.jupiter.api.Test
    public void testDivisionByZero(){
        System.out.println("division by zero");
        invalidRPNException thrown = assertThrows(
           invalidRPNException.class,
           () -> compute.compute("3 0.0 /"));
        assertTrue(thrown.getMessage().contentEquals("Division by zero is undefined"));
    }
    
     /**
     * Test of empty string input in compute method, of class compute.
     */
    @org.junit.jupiter.api.Test
    public void testEmptyString(){
        System.out.println("empty string of input");
        invalidRPNException thrown = assertThrows(
           invalidRPNException.class,
           () -> compute.compute(""));
        assertTrue(thrown.getMessage().contentEquals("No input"
                + " was provided"));
    }
    
     /**
     * Test of long string input in compute method, of class compute.
     * NOT IMPLEMENTED
     */
    @org.junit.jupiter.api.Test
    public void testLongString(){
        System.out.println("long string of input");
        String args = "8.2 4.8 7.4 8 7.3 10 22.5 * + - / * -";
        double expResult = 8.35835934;
        double result = compute.compute(args);
        assertEquals(expResult, result, 0.0000001);
    }
    
     /**
     * Test of more numbers than supported by the number of operators
     * in compute method of class compute.
     */
    @org.junit.jupiter.api.Test
    public void testTooManyNumbers(){
        System.out.println("more numbers than supported");
        invalidRPNException thrown = assertThrows(
           invalidRPNException.class,
           () -> compute.compute("3 2.7 -30.0 *"));
        assertTrue(thrown.getMessage().contentEquals("More numbers"
                + " were inputed than supported by the number of operators"));
    }
    
     /**
     * Test of fewer numbers than supported by the number of operators
     * in compute method, of class compute.
     */
    @org.junit.jupiter.api.Test
    public void testTooFewNumbers(){
        System.out.println("fewer numbers than supported");
        invalidRPNException thrown = assertThrows(
           invalidRPNException.class,
           () -> compute.compute("3 *"));
        assertTrue(thrown.getMessage().contentEquals("Fewer numbers"
                + " were inputed than supported by the number of operators"));
    }
    
     /**
     * Test of an invalid operator input in compute method, of class compute.
     * NOT WORKING
     */
    @org.junit.jupiter.api.Test
    public void testInvalidOperator(){
        System.out.println("invalid operator input");
        invalidRPNException thrown = assertThrows(
           invalidRPNException.class,
           () -> compute.compute("1 2 % *"));
        assertTrue(thrown.getMessage().contentEquals("An invalid"
                + " character has been inputed"));
    }    
}
