/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recta_dib;

import javax.swing.JOptionPane;

/**
 *
 * @author Folken
 */
public class recta_dib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x,y,x_valor, x_2,x_y;
        //float m = (float) 2.0;
        float m;
        m = Float.parseFloat(JOptionPane.showInputDialog("Pendiente"));
        
        x_y=11;
        //recta en cuarto cuadrante
        /*
        for(x=0; (int)(x/m)<=x_y;x++){
            x_valor= (int)(x/m);
            for(y=0; y<x_valor; y++){
                System.out.print(" ");
                
            }
            System.out.print("*");
            System.out.println();
        }*/

        //recta en primer cuadrante
        /*
        for(x=0; (int)(x/m)<=x_y;x++){
            x_valor= x_y -(int)(x/m);
            for(y=0; y<x_valor; y++){
                System.out.print(" ");
                
            }
            System.out.print("*");
            System.out.println();
        }*/
        //Primer cuadrante y segundo
        
        for(x=0; (int)(x/m)<=x_y/2;x++){
            x_valor= (int)(x/m);
            for(y=0; y<x_valor ; y++){
                System.out.print(" ");
                
            }
            System.out.print("*");
            
            x_2= x_y -(int)(x/m)- x_valor;
            for(y=0; y<x_2; y++){
                System.out.print(" ");
                
            }
            System.out.print("*");
            System.out.println();
        }
        for(x=x_y/2; (int)(x/m)<=x_y;x++){
            x_2= x_y -(int)(x/m);
            for(y=0; y<x_2; y++){
                System.out.print(" ");
                
            }
            System.out.print("*");
            
            x_valor= (int)(x/m)-x_2;
            for(y=0; y<x_valor ; y++){
                System.out.print(" ");
                
            }
            System.out.print("*");
            System.out.println();
            
            
        }
        
        
        
        
        
    }
    
}
