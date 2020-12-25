/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lineas_juntas;

/**
 *
 * @author Folken
 */
public class lineas_juntas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int xMAX, x, y, x1, x2, xMAYOR, a;
        a = 40;
        xMAX = 20;
        float m = (float) a/xMAX;
         
        
        for(x1 = 0, y = 0; x1 < xMAX; y++){
            x1 = (int)(y/m); 
            x2 = xMAX - (int)(y/m);
            
            if(x1 > x2){
                xMAYOR = x1;
            }
            else{
                xMAYOR = x2;
            }
            //System.out.print(x1+ " " + x2);
            for(int k = 0; k <= xMAX; k++){
                if(k==x1 || k==x2 || y==0 || y==a || k==0 || k == xMAX){
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
