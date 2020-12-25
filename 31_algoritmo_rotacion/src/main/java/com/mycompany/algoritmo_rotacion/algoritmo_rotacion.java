/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algoritmo_rotacion;

/**
 *
 * @author Folken
 */
public class algoritmo_rotacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a1 = {1,2,3,4};
        int [] a2 = {1,2,3,4};
        int vuelta = 1;
        
        // De izquierda a derecha
        for(int k = 0; k < vuelta; k++){
            int aux = a1[0];
            int aux2 = a2[a2.length - 1];
            for(int i = 0; i < a1.length - 1; i++){
                a1[i] = a1[i+1];
            }
            a1[a1.length-1]= aux;
            impr(a1);
            //Derecha a Izquierda
            for(int i = 0; i < a2.length - 1; i++){
                a2[a2.length - 1 - i]=a2[a2.length - 2 - i];
            }
            a2[0]= aux2;
            impr(a2);
        }
        
        
    }
    public static void impr( int [] list){
        for(int k = 0; k < list.length; k++){
            System.out.print(list[k]);
        }System.out.println();
    }
    
}
