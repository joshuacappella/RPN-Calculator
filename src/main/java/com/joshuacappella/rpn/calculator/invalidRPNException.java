/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joshuacappella.rpn.calculator;

/**
 *
 * @author Joshua Cappella
 */
public class invalidRPNException extends RuntimeException{   
    /**
     * This exception is for invalid input strings
     * @param errorMessage
     */
    public invalidRPNException (String errorMessage){
        super(errorMessage);
    }
}
