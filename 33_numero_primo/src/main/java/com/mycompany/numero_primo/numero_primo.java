/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numero_primo;

/**
 *
 * @author Folken
 */
public class numero_primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        boolean d;
        x=100;
        
        
        for(int j=2; j <=  x ; j++){
            d=true;
            for(int i=2; i <= j/2; i++){
            
                if(j%i==0){
                    d = false;
                    break;
                }
            }
            if(d && j>1){System.out.println(j + " Es un numero primo");}
            
        }
        
        
        
        
    }
    
}
