/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.media_desv;

import javax.swing.JOptionPane;

/**
 *
 * @author Folken
 */
public class media_desv {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
         
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo: " ));;
        int arreglo[] = new int [n];
        int mayor = 0, menor = 0, posMenor = 0, posMayor = 0, suma=0, media=0, sumaC = 0;
        double desv;
        //introduce los elementos al arrelgo
        for(int a = 0; a < arreglo.length; a++){
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor: " + (a+1))); 
            arreglo[a] = valor;
            System.out.println(arreglo[a]);
        }
        //selecciona el numero mayor y menor de un arreglo, calcula la media y la desv
            mayor = arreglo[0];
            menor = arreglo[0];
        for(int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
            
            if(mayor <= arreglo[i]){
                mayor = arreglo[i];
                posMayor = i;
            }
            if(menor > arreglo[i]){
                menor = arreglo[i];
                posMenor = i;
            }
            
        }
        media = suma/n;
        //suma de cuadrados
        for(int k = 0; k < arreglo.length; k++){
            sumaC += (int) Math.pow((arreglo[k] - media),2);
        }
        
        desv = (double)Math.sqrt((double)sumaC/n);
        
        System.out.println("La media es: " + media);
        System.out.println("La desviacion es: " + desv);
        System.out.println();
        System.out.println("El numero mayor es: " + mayor + " En la posicion: " + posMayor);
        System.out.println("El numero menor es: " + menor + " En la posicion: " + posMenor);
    }
    
}
