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
    
    public static void main(String[] args) {
        String yamaha = "23.3 5 16.2 + 8 * -";
        System.out.println(compute(yamaha));
    }
}
