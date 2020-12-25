/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fusionar_arreglos;

/**
 *
 * @author Folken
 */
public class fusionar_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo_1 = {2,1,3};
        int [] arreglo_2 = {2,6,5,4};
        int num_menor = 0;
        int array_pos = 0;
        int num_menor2 = 0;
        int array_pos2 = 0;
        int num_mayor = Integer.MAX_VALUE;
        int [] contenedor = new int[arreglo_1.length + arreglo_2.length];
        
        for(int j = 0; j < contenedor.length; j++){
            num_menor = arreglo_1[0];
            array_pos = 0;
            num_menor2 = arreglo_2[0];
            array_pos2 = 0;
            for(int i = 0; i < arreglo_1.length ; i++){
                
                if ((num_menor > arreglo_1[i])){
                    num_menor = arreglo_1[i];
                    array_pos = i;
                    
                    
                }
            }
            for(int i = 0; i < arreglo_2.length; i++){
                
                if ((num_menor2 > arreglo_2[i])){
                    num_menor2 = arreglo_2[i];
                    array_pos2 = i;
                    
                    
                }
            }
            if(num_menor < num_menor2){
                arreglo_1[array_pos] = num_mayor;
                contenedor[j] = num_menor;
            }else{
                arreglo_2[array_pos2] = num_mayor;
                contenedor[j] = num_menor2;
            }
            
            //System.out.println("El numero menor es: " + num_menor + " iteracion: " + j);
            //System.out.println(array_pos);
            imprime(arreglo_2);
        }
        imprime(contenedor);
        imprime(arreglo_1);
        imprime(arreglo_2);
        
        
    }
    public static void imprime(int []lista){
        for(int k = 0; k < lista.length; k++){
            System.out.print(lista[k]);
        }
        System.out.println();
    }
    
}
