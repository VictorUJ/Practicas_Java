/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numeros_practica;

/**
 *
 * @author Folken
 */
public class numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        b=0;
        a = 0;/*
        while(a<=100){
            //System.out.println(a);
            a++;
        }*/
        /*do{
            System.out.println(a++);
            
        }
        while(a<100);
        System.out.println(a);
        */
        /*------------------------Ciclo for----------------------*/
        for(a=1; a<101; a++){
            if(a%2 == 0){
                System.out.println(a);
                b += a;
            }
        }
        System.out.println("--------------" + b);
        /*-------------------Ciclo While------------------------*/
        a=1;
        b=0;
        while(a<=100){
            if (a%2 == 0){
                System.out.println(a);
                b += a;
                
            }
            a++;
        }
        System.out.println("--------------" + b);
        /*---------------------Do while----------------------*/
        a=1;
        b=0;
        do{
           if(a%2 == 0){
                System.out.println(a); 
                b += a;
           }
            a++;  
        }
        while(a<=100);
        System.out.println("--------------" + b);
        
        
        /*-------------------Ciclo While y CONTINUE------------------------*/
        a=1;
        b=0;
        while(a<=100){
            if (a%2 != 0){
                a++;
                continue;
            }
            System.out.println(a);
            b += a;
            a++;
        }
        System.out.println("--------------" + b);
        
    }
       
}
    

