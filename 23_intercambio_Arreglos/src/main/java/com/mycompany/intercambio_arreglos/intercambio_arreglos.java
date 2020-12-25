/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.intercambio_arreglos;

/**
 *
 * @author Folken
 */
public class intercambio_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[]={1,2,3,5,4};
        int n, c;
        n = arreglo.length;
        c = n -1;
        int aux;
        
        for(int i = 0; i < n/2; i++){
            aux = arreglo[i];
            arreglo[i] = arreglo[c-i];
            arreglo[c-i] = aux;
            //imprime(arreglo);
        }
        imprime(arreglo);
    }
    public static void imprime(int lista[]){
        for(int a = 0; a < lista.length; a++){
            System.out.println(lista[a]);
        }
        System.out.println();
    }
    
}
