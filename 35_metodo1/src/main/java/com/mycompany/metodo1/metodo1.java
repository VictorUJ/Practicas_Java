/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metodo1;

/**
 *
 * @author Folken
 */
public class metodo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []arreglo={1,2,5,4,4};
        
        llena(arreglo);
        imprime(arreglo);
        crea(3);
        
    }
    public static void llena(int []a1){
        for(int i=0; i<a1.length;i++){
            a1[i]=i;
        }
    }
     public static void imprime(int []a1){
        for(int i=0; i<a1.length;i++){
            System.out.print(a1[i]);
        }
        System.out.println();
    }
     public static int[] crea(int n){
         int []a2 = new int[n];
         for(int i=0; i<a2.length;i++){
            a2[i]=i;
        }
         imprime(a2);
        return a2;
     }
    
}
