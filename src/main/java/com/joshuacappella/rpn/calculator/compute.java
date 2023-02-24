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
     * @param rpn
     * @return
     */
    public static double compute(String[] args){
        double result = 0;
        String math = "";
        Stack<Double> stack = new Stack<Double>();
        for(int i = 0; i < stack.size(); i++){
            Scanner itemN = new Scanner(System.in);
            String item = itemN.toString();
            if((item != "+") && (item != "-") &&
                    (item != "*") && (item != "/")){
                double d = Double.parseDouble(item);
                stack.push(d); 
            }
            else if(("+" == item) || (item == "-") ||
                    (item == "*") || (item == "/")){
                math += item;
            }
        }
        while(math.length() != 0){
            if(math.charAt(0) == '+'){

            }
            else if(math.charAt(0) == '-'){

            }
            else if(math.charAt(0) == '*'){

            }
            else if(math.charAt(0) == '/'){

            }
            math = math.substring(1);
        }
        return result;
    }
}
