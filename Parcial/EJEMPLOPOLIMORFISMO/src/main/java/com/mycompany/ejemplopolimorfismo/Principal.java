/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplopolimorfismo;

/**
 *
 * @author Jamex
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Moto[] moto = new Moto[3];
       
       moto[0]= new  Moto("VMMA-55G","Honda","2024F");
       moto[1]= new  motoDeportiva(150,"VMA-65F","ZUZUKI","2021");
       moto[2]= new  motoUrbana(2,"VMd-65D","NKD","2020");
       
       for (Moto vehiculos :moto){
           System.out.println(vehiculos.mostrarDatos());
           System.out.println(" ");
       }
        
    }
    
}
