/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglo_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Folken
 */
public class arreglo_mayor_menor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo: " ));;
        int arreglo[] = new int [n];
        int mayor = 0, menor = 0, posMenor = 0, posMayor = 0;
        
        for(int a = 0; a < arreglo.length; a++){
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor: " + (a+1))); 
            arreglo[a] = valor;
            System.out.println(arreglo[a]);
        }
            mayor = arreglo[0];
            menor = arreglo[0];
        for(int i = 0; i < arreglo.length; i++){
            
            
            if(mayor <= arreglo[i]){
                mayor = arreglo[i];
                posMayor = i;
            }
            if(menor > arreglo[i]){
                menor = arreglo[i];
                posMenor = i;
            }
            
        }
        System.out.println("El numero mayor es: " + mayor + " En la posicion: " + posMayor);
        System.out.println("El numero menor es: " + menor + " En la posicion: " + posMenor);

        
        /*
         int aux;//Ordenar arreglos
         
         
         int elemento[] = {2, 4, 1, 5};//Los elemento del arreglo
         
         
         //ciclo para comparar los elemento del arreglo
         for (int i = 0; i < elemento.length - 1 ; i++){
             
             for(int k = i + 1; k < elemento.length ; k++){
                 
                 if(elemento[i] < elemento[k]){
                     aux = elemento[i];
                     elemento[i] = elemento[k];
                     elemento[k] = aux;
                     
                 }
                 imprimir(elemento);
             }
         }


    }
    public static void imprimir(int lista[]){
        for (int a=0; a < lista.length; a++){
            System.out.print(lista[a]);
            
        }
        System.out.println();*/
    }
}
