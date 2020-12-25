/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.divisores_num;

/**
 *
 * @author Folken
 */
public class divisores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        boolean c;
        a=100;
        for(int i=1; i<a; i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
        System.out.println("------------------");
        
        /*NUMERO PERFECTO*/
        b=0;
        c=false;
        
        for(int j=1; j<a; j++){
            
            if(a%j==0){
                //System.out.println(j);
                b=b+j;
                //System.out.println(b);
                if(b==a){
                    c=true;
                }
                
            }
        }
        if(c){
            System.out.println("Es un numero perfecto");
        } else {
            System.out.println("NO es un numero perfecto");
        }
        System.out.println("-----------------------------");
        
        /*Numeros perfectos entre 2 a 1,000,000*/
        int z;
        
        b=0;
        for(z=2; z<=6; z++){
            for(int j=1; j<z; j++){
            
                if(z%j==0){
                    //System.out.println(j);
                    b=b+j;
                 System.out.println(b);
                }
                    
                
                
            }
            if(b==z){
                      System.out.println(b);
                    }
        }
        
        
    }
    
}
