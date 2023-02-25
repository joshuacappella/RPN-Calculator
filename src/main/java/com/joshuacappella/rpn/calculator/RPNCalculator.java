/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.joshuacappella.rpn.calculator;

import static com.joshuacappella.rpn.calculator.compute.compute;

/**
 *
 * @author Joshua Cappella
 */
public class RPNCalculator {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(compute("8.2 4.8 7.4 8 7.3 10 22.5 * + - / * -"));
    }
}
