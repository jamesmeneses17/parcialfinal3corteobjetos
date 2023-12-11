/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partepractica;

/**
 *
 * @author Jamex
 */
public class LibroFisico extends Libro {
  
    private int paginas;

    public LibroFisico(String titulo, String autor, int año, int paginas) {
        super(titulo, autor, año); 
        this.paginas = paginas; 
    }

   
    public int getPaginas() {
        return paginas;
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("Páginas: " + paginas); 
    }
}