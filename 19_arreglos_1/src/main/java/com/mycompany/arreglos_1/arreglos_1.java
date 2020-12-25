/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglos_1;

/**
 *
 * @author Folken
 */
public class arreglos_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int[] datos; //declaracion
        int tamArreglos = 2;
        datos = new int [tamArreglos*2];
        System.out.print(datos.length);*/
        
        int[]enteros;
        int tamArreglo = 20;
        enteros = new int[tamArreglo];
        for(int i=0; i<enteros.length; i++){
            enteros[i] = i;
        }
        for(int i = 0; i<enteros.length;i++){
            System.out.println("Datos[" + i + "]= "+ enteros[i]);
        }
    }
    
}
