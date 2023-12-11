/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploherencia;

/**
 *
 * @author Jamex
 */
public class Profesor extends Persona {
    private int codProfesor;
    private float salario;

    public Profesor(int codProfesor, float salario, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codProfesor = codProfesor;
        this.salario = salario;
    }
    
    public void mostrarDatos (){
        System.out.println("nombre: "+getNombre()+" apellido: "+getApellido()+" edad: "+getEdad()+" codigo profesor: "+codProfesor+" salario: "+salario);
    }
    
    
    
}
