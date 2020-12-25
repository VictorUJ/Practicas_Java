/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arbol_de_navida;

/**
 *
 * @author Folken
 */
public class arbol_de_navidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, n, k, j;
       n=11;//numero de renglon, para renglones inpares
        
        for(i=1; i<=n; i++){
            for(k=1; k<=n-i; k++){
              System.out.print("\t");
            }
        
            for(j=1; j<=(i*2-1); j++){
              System.out.print("*" + "\t"); 
             
            }
            System.out.println();
        }
        
        
        
        
    }
    
}
