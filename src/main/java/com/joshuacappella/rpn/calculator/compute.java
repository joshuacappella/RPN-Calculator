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
        if(args == ""){
            throw new invalidRPNException("No input was provided");
        }
        double result = 0;
        Stack<Double> stack = new Stack<>();
        Scanner itemN = new Scanner(args);
        while(itemN.hasNext()){
            if(itemN.hasNextDouble()){
                stack.push(itemN.nextDouble());
            }
            else{
                try{
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
                            if(Double.isInfinite(result)){
                                    throw new invalidRPNException("Division by zero is undefined");
                            }
                            stack.push(result);
                        }
                        default -> {
                            throw new invalidRPNException("An invalid"
                                + " character has been inputed"); 
                        }
                    }
                }
                catch(EmptyStackException e){
                    throw new invalidRPNException("Fewer numbers were inputed"
                        + " than supported by the number of operators");
                }
            }
        }
        if(stack.size() > 1){
            throw new invalidRPNException("More numbers were inputed"
                    + " than supported by the number of operators");
        }
        return result;
    }
}
