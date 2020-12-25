/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglo_en_orden;

/**
 *
 * @author Folken
 */
public class arreglo_en_orden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo [] = {3,2,1};
        
        boolean ordenAsc = true;
        
        for (int i = 0; i < arreglo.length - 1; i++){
            
            if( !(arreglo[i] < arreglo[i + 1]) ){
                ordenAsc = false;
                break;
            }
            
            
            
        }
        
        if(ordenAsc){
            System.out.println("El arreglo esta ordenado de manera ascendente");
        }
        else{
            System.out.println("El arreglo no esta ordenado de manera ascendente");
        }
        
        
        
        
        
    }
    
}
