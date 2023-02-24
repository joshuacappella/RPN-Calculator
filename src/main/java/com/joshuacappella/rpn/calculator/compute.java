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
    public static double compute(String[] args){
        double result = 0;
        String math = "";
        Stack<Double> stack;
        stack = new Stack<Double>();
        for(int i = 0; i < stack.size(); i++){
            Scanner itemN = new Scanner(System.in);
            String item = itemN.toString();
            if((!"+".equals(item)) && (!"-".equals(item)) &&
                    (!"*".equals(item)) && (!"/".equals(item))){
                double d = Double.parseDouble(item);
                stack.push(d); 
            }
            else if(("+".equals(item)) || ("-".equals(item)) ||
                    ("*".equals(item)) || ("/".equals(item))){
                math += item;
            }
        }
        double lastResult = stack.pop();
        while(math.length() != 0){
            if(math.charAt(0) == '+'){
                result += lastResult;
            }
            else if(math.charAt(0) == '-'){
                result -= lastResult;
            }
            else if(math.charAt(0) == '*'){
                result *= lastResult;
            }
            else if(math.charAt(0) == '/'){
                result /= lastResult;
            }
            if(math.length()== 2){
                math = math.substring(1);
            }
            else if(math.length() == 1){
                math = "";
            }
        }
        return result;
    }
}
