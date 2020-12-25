/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serie_de_numeros;

/**
 *
 * @author Folken
 */
public class serie_de_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*hacer la serie 1, 1, 2, 3, 5...*/
        int a, b, c;
        b=0;
        a=1;
        
        for(int j=1; j<=10; j++){
            
            c = a + b;
            System.out.println(c);
            a=b;
            b=c;
            
        }
    }
    
}
