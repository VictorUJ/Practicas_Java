/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conver_ascii;

/**
 *
 * @author Folken
 */
public class ascii {
    //Combierte el arreglo de caracteres a ascii
    
    static void arreglo_num (char arreglo[]){
       
        int[] arreglo_C = new int[arreglo.length];
        //Llena el arreglo_C
        for (int i = 0; i < arreglo.length; i++ )
        {
            arreglo_C[i] = (int) arreglo[i];
            System.out.println(arreglo_C[i]);
        }
        //Colocar el ordenamiento, ya ordenada
        System.out.println("el numero es: " + arreglo_C[0]);
        //cambiar el arreglo a letras pero no imprime nada
        char[] arreglo_D = new char[arreglo.length];
        int j;
        for (j=0; j<arreglo.length; j++){
            arreglo_D[j] = (char)arreglo[j];
        }
       
    }    
    
    static void imprime_arr ( int arreglo[] )
    {
        int i;
        for (i = 0; i < arreglo.length; i++)
            System.out.print(arreglo[i]+ "  ");            
    }
    
   public static void main(String[] args) {
    char[] arreglo_A = {'a','b'};
    arreglo_num(arreglo_A);
    
   
 }
}
