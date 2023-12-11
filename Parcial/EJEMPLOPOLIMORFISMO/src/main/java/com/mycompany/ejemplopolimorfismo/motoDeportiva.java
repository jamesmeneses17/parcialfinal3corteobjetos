/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplopolimorfismo;

/**
 *
 * @author Jamex
 */
public class motoDeportiva extends Moto {
    private int cilindraje;

    public motoDeportiva(int cilindraje, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindraje = cilindraje;
    }
    
    

  
    public int getCilindraje() {
        return cilindraje;
    }
    
    @Override
    public String mostrarDatos(){
        return "matricula "+matricula+" marca : "+marca+" modelo: "+modelo+" capacidad"+cilindraje;
    }
}
