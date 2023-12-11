/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejemplointerfazdefault;

/**
 *
 * @author Jamex
 */

public interface Operaciones {
   
    public static final int FACTOR = 10;
    

    public int sumar(int a, int b);
    public int restar(int a, int b);
    

    default int multiplicar(int a, int b) {
        return a * b * FACTOR;
    }
}

