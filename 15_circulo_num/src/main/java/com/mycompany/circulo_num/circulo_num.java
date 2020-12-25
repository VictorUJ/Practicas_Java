/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.circulo_num;

/**
 *
 * @author Folken
 */
public class circulo_num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
                int x, b, y, radio, yEVAL, xEVAL;
        float a,c;
        radio = 10;
        
        //a = (float)Math.pow(radio,2);
        for(y = radio; y >= -radio; y--){
            b=1;
            //System.out.print(y);
            for(x = -radio; x <= radio; x++){
                
                xEVAL = (int)Math.sqrt(Math.pow(radio,2)-Math.pow(y,2));        
                //System.out.print(x);
                if (x > xEVAL || x < -xEVAL ){
                    System.out.print(" ");
                }
                else{
                   System.out.print(b%10); 
                   b++;
                }
                /*c= = (float)(a-b);
                if(y == (int)(Math.sqrt(b - a)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }*/
                
               
            }
            System.out.println();
        }
    }
    
}
