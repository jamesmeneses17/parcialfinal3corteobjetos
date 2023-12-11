/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplopolimorfismo;

/**
 *
 * @author Jamex
 */
public class motoUrbana extends Moto {
    private int capacidad; 

    public motoUrbana(int capacidad, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    @Override
    public String mostrarDatos(){
         return "matricula "+matricula+" marca : "+marca+"  modelo: "+modelo+" capacidad: "+capacidad;
        
    }
    
    
}
