/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.piramide_in;

import javax.swing.JOptionPane;

/**
 *
 * @author Folken
 */
public class piramide_inv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y;
         y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de renglones: "));
        
        int n,a, b=y, r_1=y;
        for(n=1; n<=r_1;n++){
            for(b=y-1*n; b>0; b--){
                System.out.print("\t");
            }
            for(a=1;a<=n;a++){
                System.out.print(-a+n+1+"\t");            
            }
            System.out.println();  
        }        
            
          
        
        
    }
    
}
