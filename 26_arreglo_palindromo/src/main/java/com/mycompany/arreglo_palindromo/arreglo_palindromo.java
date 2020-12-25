/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglo_palindromo;

/**
 *
 * @author Folken
 */
public class arreglo_palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []arreglo = {1,2,2,1};
        int n = arreglo.length;
        boolean palindromo = false;
        
        for(int i = 0; i < n/2; i++){
            if (arreglo[i] == arreglo[n - i - 1]){
                palindromo = true;
            }
        }
        if (palindromo){
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No es un palindromo");
        }
       
        
    }
    
}
