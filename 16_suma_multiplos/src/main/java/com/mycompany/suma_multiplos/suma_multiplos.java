/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.suma_multiplos;

/**
 *
 * @author Folken
 */
public class suma_multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
            
        /*------------------------Ciclo for----------------------*/
        
        b=0;
        for(a=1; a<101; a++){
            if(!(a%2 == 0 && a%6==0)){
                continue;
            }
            System.out.println(a);
                b += a;
        }
        System.out.println("--------------" + b);
        
        /*---------------------Do while----------------------*/
        a=1;
        b=0;
        do{
           if(!(a%2 == 0 && a%6==0)){
               a++; 
               continue;
                
           }
           System.out.println(a); 
                b += a;
            a++;  
        }
        while(a<=100);
        System.out.println("--------------" + b);
          
        
        
        
        /*-------------------Ciclo While y CONTINUE------------------------*/
        a=1;
        b=0;
        while(a<=12){
            if (!(a%2==0 && a%6==0)){
                a++;
                continue;
            }
            System.out.println(a);
            b += a;
            a++;
        }
        System.out.println("--------------" + b);
        /*Sin continue*/
        
        /*------------------------Ciclo for----------------------*/
        
        b=0;
        for(a=1; a<101; a++){
            if(!(a%2 == 0 && a%6==0)){
                continue;
            }
            System.out.println(a);
                b += a;
        }
        System.out.println("--------------" + b);
        
        /*---------------------Do while----------------------*/
        a=1;
        b=0;
        do{
           if((a%2 == 0 && a%6==0)){
               
               
               System.out.println(a); 
               b += a;
               a++; 
                
           }
           
            a++;  
        }
        while(a<=100);
        System.out.println("------2--------" + b);
          
        
        
        
        /*-------------------Ciclo While y CONTINUE------------------------*/
        a=1;
        b=0;
        while(a<=12){
            if ((a%2==0 && a%6==0)){
                System.out.println(a);
                b += a;
                a++;
                
            }
            
            a++;
        }
        System.out.println("------dd--------" + b);
        
    }
    
}
