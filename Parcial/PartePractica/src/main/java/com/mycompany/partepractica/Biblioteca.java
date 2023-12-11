/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partepractica;

/**
 *
 * @author Jamex
 */
public class Biblioteca {
    
    private Libro[] libros;

  
    public Biblioteca(Libro[] libros) {
        this.libros = libros; 
    }

 
    public void imprimir() {
       
        for (Libro libro : libros) {           
            libro.imprimir();
            System.out.println();
        }
    }
}

