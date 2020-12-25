/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglo10;

import javax.swing.JOptionPane;

/**
 *
 * @author Folken
 */
public class arreglo_compara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] datos; 
        int tamArreglo = 3;
        boolean orden = true;
        datos = new String[tamArreglo];
        //String animal_1 = JOptionPane.showInputDialog("Nombre de animal");
        //System.out.println(animal_1);
        
        // Introduce los valores al arreglo
        for(int i = 0; i < tamArreglo ; i++){
            datos[i] = JOptionPane.showInputDialog("Nombre de animal");
        }
        imprime(datos);
        //Verifica si esta ordenado el arreglo
        for(int j = 0; j < tamArreglo - 1; j++){
            if(!(datos[j].compareToIgnoreCase(datos[j+1])<=0)){
                orden = false;
                break;
            }
            
        }
        if(orden){
            System.out.print("ESTA ORDENADO");
        }else{
            System.out.print("NO ESTA ORDENADO DE MANERA ASCENDENTE");
        }
    }
    public static void imprime(String []lista){
        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
    }
}
