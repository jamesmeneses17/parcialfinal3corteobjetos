/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemploherencia;

/**
 *
 * @author Jamex
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor profesor = new Profesor(323244343,1200000,"Juanes","Perez",32);
        profesor.mostrarDatos();
        
          Profesor profesor2 = new Profesor(323244376,1700000,"Isabel","Rodriguez",19);
        profesor2.mostrarDatos();
    }
    
}
