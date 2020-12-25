/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglo_de_caracteres;

/**
 *
 * @author Folken
 */
public class arreglo_carracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String animal1 = "perro1";
       String animal2 = "Perro";
       int tamArreglo = 0, mayor;
       char [] arreglo_1 = animal1.toCharArray();
       char [] arreglo_2 = animal2.toCharArray();
       
       if(arreglo_1.length > arreglo_2.length){
           tamArreglo = arreglo_2.length;
       }else{
           tamArreglo = arreglo_1.length;
       }
       
       
        mayor = arreglo_1.length - arreglo_2.length;   
        for(int i = 0; i < tamArreglo; i++){      //se puede hacer int i = 0; i < arreglo_1.length && i < arreglo_2.length; i++ ---pero se debe quitar el if que determina cual es el mayor
            if(arreglo_1[i] - arreglo_2[i] != 0){
                mayor = arreglo_1[i] - arreglo_2[i];
                break;           
            }
        }
        
        if(mayor > 0){
            System.out.println("uno es mayor");
        }else if(mayor < 0){
            System.out.println("dos es mayor");
        }else if(mayor == 0){
            System.out.println("Son iguale");
        }
       
       
       
    
        
    }
    
    
}
