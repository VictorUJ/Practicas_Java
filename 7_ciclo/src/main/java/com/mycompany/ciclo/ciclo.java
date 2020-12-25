/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ciclo;

import javax.swing.JOptionPane;

/**
 *
 * @author Folken
 */
public class ciclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int y;
         y = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de renglones: "));
        
        int n,a, r_1=y;
        for(n=1; n<=r_1;n++){
            for(a=1;a<=n;a++){
                System.out.print(a);
            }
          System.out.println();  
        }
        
        int z,x,r=y,p=r+1;//r es la variable del renglo
        for(z=1; z<=r;z++){
            for(x=1;x<=z;x++){
                System.out.print(p-x+ "\t");
            }
          System.out.println();  
        }
    }
    
}
