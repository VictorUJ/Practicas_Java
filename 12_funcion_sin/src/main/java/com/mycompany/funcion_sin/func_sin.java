/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.funcion_sin;

/**
 *
 * @author Folken
 */
public class func_sin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int xMAX, amplitud, ciclos, x, y;
        float omega, phi;
        ciclos = 2;
        xMAX = 80;
        amplitud = 20;
        phi = (float) 0.5;
        
        omega = (float)((ciclos*2.0*Math.PI)/xMAX);
        for(y = amplitud; y >= -amplitud; y--){
            for(x = 0; x <= xMAX; x++){
                if(y == (int)(amplitud*Math.sin(omega*x + phi))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
               
            }
            System.out.println();
        }
    }
    
}
