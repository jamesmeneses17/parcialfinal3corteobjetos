/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplointerfazdefault;

/**
 *
 * @author Jamex
 */
public class Principal {
 
    public static void main(String[] args) {
     
        Calculadora calc = new Calculadora();
     
        System.out.println(calc.sumar(3, 2)); 
        System.out.println(calc.restar(3, 2));
        System.out.println(calc.multiplicar(3, 2)); 
    }
}