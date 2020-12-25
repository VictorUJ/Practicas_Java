/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.orden_fuerza;

/**
 *
 * @author Folken
 */
public class orden_fuerza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo = {5,2,1,8,6};
        int [] arreglo1 = new int[5];
        int numMayor = 9;
        int posMenor = 0;
        int menor=0;
        
        for(int i = 0; i < arreglo.length; i++){
            menor = arreglo[0];
            posMenor = 0;
            for(int j = 0; j < arreglo.length; j++){
                if(menor > arreglo[j]){
                    menor = arreglo[j];
                    posMenor = j;
                }
                
            }
            arreglo1[i] = menor;
            arreglo[posMenor] = Integer.MAX_VALUE;
            
        }
        imprime(arreglo1);
        imprime(arreglo);
        
    }
    public static void imprime(int [] list){
        for(int k = 0; k < list.length; k++){
            System.out.print(list[k]);
        }
        System.out.println();
    }
    
}
