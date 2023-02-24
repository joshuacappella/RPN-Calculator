/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joshuacappella.rpn.calculator;

import java.util.*;


/**
 *
 * @author Joshua Cappella
 */
public class compute {

    /**
     *
     * @param args
     * @return
     */
    public static double compute(String args){
        double result = 0;
        Stack<Double> stack = new Stack<>();
        Scanner itemN = new Scanner(args);
        while(itemN.hasNext()){
            if(itemN.hasNextDouble()){
                stack.push(itemN.nextDouble());
            }
            else{
                switch (itemN.next()) {
                    case "+" -> {
                        double top = stack.pop();
                        double nextTop = stack.pop();
                        result = top + nextTop;
                        stack.push(result);
                    }
                    case "-" -> {
                        double top = stack.pop();
                        double nextTop = stack.pop();
                        result = nextTop - top;
                        stack.push(result);
                    }
                    case "*" -> {
                        double top = stack.pop();
                        double nextTop = stack.pop();
                        result = top * nextTop;
                        stack.push(result);
                    }
                    case "/" -> {
                        double top = stack.pop();
                        double nextTop = stack.pop();
                        result = nextTop / top;
                        stack.push(result);
                    }
                    default -> {
                    }
                }
            }
        }
        return result;
    }
}
