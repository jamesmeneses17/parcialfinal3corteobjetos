/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.partepractica;

/**
 *
 * @author Jamex
 */
public class Principal {
 
    public static void main(String[] args) {
      
        LibroFisico libro1 = new LibroFisico("El principito", "Antoine de Saint-Exupéry", 1943, 96);
        LibroElectronico libro2 = new LibroElectronico("1984", "George Orwell", 1949, "PDF");
        LibroFisico libro3 = new LibroFisico("Cien años de soledad", "Gabriel García Márquez", 1967, 494);
        LibroElectronico libro4 = new LibroElectronico("El código Da Vinci", "Dan Brown", 2003, "EPUB");
        LibroFisico libro5 = new LibroFisico("El alquimista", "Paulo Coelho", 1988, 192);
        LibroElectronico libro6 = new LibroElectronico("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, "EPUB");
        LibroFisico libro7 = new LibroFisico("El perfume", "Patrick Süskind", 1985, 255);
        LibroElectronico libro8 = new LibroElectronico("El hobbit", "J.R.R. Tolkien", 1937, "PDF");
  
        Libro[] lista = {libro1, libro2, libro3, libro4, libro5, libro6, libro7, libro8};
        Biblioteca biblioteca = new Biblioteca(lista);
        biblioteca.imprimir();
    }
}
