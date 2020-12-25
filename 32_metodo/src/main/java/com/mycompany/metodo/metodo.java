/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metodo;

/**
 *
 * @author Folken
 */
public class metodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s;
        int x = 2;
        int y = 3;
        s = suma(x+2, y+3, true);
        System.out.println(s);              
    }
    
    public static int suma(int a, int b, boolean sum){
        int c;
        if(sum){
            return a+b;
        }
        else{
            return a-b;
        }
    }
    
}
