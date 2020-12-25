/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modulos;

import java.util.Arrays;

/**
 *
 * @author Folken
 */
public class modulos {

    /**
     * @param args the command line arguments
     */
    public static int[] crea(int n){
        int [] datos = new int[n];
        for(int i = 0; i<datos.length; i++){
            datos[i]=(int)Math.floor(Math.random()*10);
        }
        return datos;
    }
    public static double mean(int[] datos){
        double suma = 0.0;
        for(int i = 0; i<datos.length;i++){
            suma += datos[i];
        }
        return suma/datos.length;
    }
    public static double sd(int []datos){
        double m = mean(datos);
        double error = 0;
        for(int i =0; i<datos.length;i++){
            error += Math.pow(datos[i]-m, 2); 
        }
        error /= datos.length;
        error = Math.sqrt(error);
        return error;
    }
    public static void muestra(int []datos, double desv){
        System.out.println(Arrays.toString(datos));
        System.out.println("La SD = " + desv);
    }
    public static void coordinador(){
        int[] datos = crea(10);
        double sdvalor = sd(datos);
        muestra(datos, sdvalor);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        coordinador();
    }
    
    
}
