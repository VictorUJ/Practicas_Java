/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglo_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Folken
 */
public class arreglo_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo: " ));;
        int arreglo[] = new int [n];
        
        for(int a=0; a<arreglo.length; a++){
            int valor=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor: " + (a+1))); 
            arreglo[a]=valor;
            System.out.println(arreglo[a]);
        }
    }
    
}
