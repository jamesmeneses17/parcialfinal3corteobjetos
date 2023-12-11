/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partepractica;

/**
 *
 * @author Jamex
 */
public class LibroElectronico extends Libro {
    
    private String formato;

   
    public LibroElectronico(String titulo, String autor, int año, String formato) {
        super(titulo, autor, año);
        this.formato = formato; 
    }

 
    public String getFormato() {
        return formato;
    }

   
    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("Formato: " + formato); 
    }
}
