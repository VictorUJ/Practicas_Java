/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglo_ordenado;

import javax.swing.JOptionPane;

/**
 *
 * @author Folken
 */
public class arreglo_ordenado {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo: " ));;
        int arreglo[] = new int [n];
        
        
        for(int a = 0; a < arreglo.length; a++){
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor: " + (a+1))); 
            arreglo[a] = valor;
            System.out.println(arreglo[a]);
        }
        ordenar(arreglo, n);
        //imprimir(arreglo);
        
    }
    
    public static void ordenar(int elemento[], int n){
        int aux;
        
        
        for (int i = 0; i < elemento.length - 1 ; i++){
             
             for(int k = i + 1; k < elemento.length ; k++){
                 
                 if(elemento[i] < elemento[k]){
                     aux = elemento[i];
                     elemento[i] = elemento[k];
                     elemento[k] = aux;
                     
                 }
                 System.out.println("El numero mayor es: " + elemento[0]);
                 System.out.println("El numero menor es: " + elemento[n]);
                 //imprimir(elemento);
             }
         }
    }
    
    public static void imprimir(int lista[]){
        for (int a=0; a < lista.length; a++){
            System.out.print(lista[a]);
            
        }
        System.out.println();
    }
    
}
