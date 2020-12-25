/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rotacion_modulo;

/**
 *
 * @author Folken
 */
public class rotacion_modulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a1 = {1,2,3,4,5};
        int [] a2 = new int[a1.length];
        int n = 2;
        for(int i = 0; i < a1.length; i++){
            a2[(i + a1.length + n)%a1.length] = a1[i];
        }
        impr(a2);
    }
    public static void impr( int [] list){
        for(int k = 0; k < list.length; k++){
            System.out.print(list[k]);
        }System.out.println();
    }
    
}
