/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto;

/**
 *
 * @author Uribe Jalpa Victor
 */
public class ordenamiento_nombre_apellidos {
    /*Cambia el arrelgo de letras a numeros para hacer el ordenamiento*/
  

    
    static void imprime_arr ( int arreglo[] )
    {
        int i;
        for (i = 0; i < arreglo.length; i++)
            System.out.print(arreglo[i]+ "  ");            
    }
    
    static void imprime_arr1 ( char arreglo[] )
    {
        int i;
        for (i = 0; i < arreglo.length; i++)
            System.out.print(arreglo[i]+ "  ");            
    }

    static void burbuja ( char arreglo_C[] )
    {
        /*Convertir letras a su valor numerico*/
        int[] arreglo = new int[arreglo_C.length];
        int k;
        for (k = 0;k<arreglo.length;k++ )
        {
            arreglo[k] = (int) arreglo_C[k];
        }
        /*************************************/
        int i, j, aux;
        for (i = 0; i < arreglo.length; i++)
        {    
            for ( j = 0; j < arreglo.length-1-i; j++ )
            {
                System.out.print("i = " + i +" j = " + j + "   ");
                imprime_arr (arreglo);
                System.out.println("  ");
                if ( arreglo[j] > arreglo[j+1])
                {
                    aux = arreglo[j];
                    System.out.print("i = " + i +" j = " + j + " aux = " + aux + "     ");
                    imprime_arr (arreglo);
                    System.out.println("  ");
                    arreglo[j] = arreglo[j+1];
                    
                    System.out.print("i = " + i +" j = " + j + " aux = " + aux + "     ");
                    imprime_arr (arreglo);
                    System.out.println("  ");
                    arreglo[j+1] = aux;
                    
                    System.out.print("i = " + i +" j = " + j + " aux = " + aux + "     ");
                    imprime_arr (arreglo);
                    System.out.println("  ");
                }
            }    
        }
        letras(arreglo);
    }
        
    
    static void OrdenInsercion (char arreglo_C[] )
    {
        /*Convertir letras a su valor numerico*/
        int[] arreglo = new int[arreglo_C.length];
        int k;
        for (k = 0;k<arreglo.length;k++ )
        {
            arreglo[k] = (int) arreglo_C[k];
        }
        /*************************************/
        
        int i, j, aux;
        for (i = 1; i < arreglo.length; i++)
        {
            j = i; 
            System.out.print("i = " + i +" j = " + j +  "  ");
            imprime_arr (arreglo);
            System.out.println("  ");
            while ( j > 0 && arreglo[j-1] > arreglo[j])
            {
                aux = arreglo[j];
                System.out.print("i = " + i +" j = " + j + " aux = " + aux + "     ");
                imprime_arr (arreglo);
                System.out.println("  ");
                
                arreglo[j] = arreglo[j-1];
                System.out.print("i = " + i +" j = " + j + " aux = " + aux + "     ");
                imprime_arr (arreglo);
                System.out.println("  ");
                
                arreglo[j-1] = aux;
                System.out.print("i = " + i +" j = " + j + " aux = " + aux + "     ");
                imprime_arr (arreglo);
                System.out.println("  ");
                
                j--;          
            }
        }
        letras(arreglo);
        
    }
    
    static void ordenSeleccion (char arreglo_C[] )
    {
        /*Convertir letras a su valor numerico*/
        int[] arreglo = new int[arreglo_C.length];
        int k;
        for (k = 0;k<arreglo.length;k++ )
        {
            arreglo[k] = (int) arreglo_C[k];
        }
        /*************************************/
        int i, j, indice_mayor, aux;
        for(j = arreglo.length - 1; j >= 1; j-- )
        {
            indice_mayor = 0;               
            for (i = 1; i <= j; i++)
            {
                System.out.print("i = " + i +" j = " + j +  "     ");
                imprime_arr (arreglo);
                System.out.println("  ");
                
                if ( arreglo[i] > arreglo[indice_mayor])
                {
                   indice_mayor = i;
                   System.out.println("índice mayor = " + indice_mayor +"  ");                   
                }
            }
            aux = arreglo [indice_mayor];
            System.out.print("i = " + i +" j = " + j + " aux = " + aux + "     ");
            imprime_arr (arreglo);
            System.out.println("  ");
               
            arreglo [indice_mayor] = arreglo [j];
            System.out.print("i = " + i +" j = " + j + " aux = " + aux + "     ");
            imprime_arr (arreglo);
            System.out.println("  ");
               
            arreglo[j] = aux;
            System.out.print("i = " + i +" j = " + j + " aux = " + aux + "     ");
            imprime_arr (arreglo);
            System.out.println("  ");
        }
        letras(arreglo);
    }
    
    /**********Imprime el arreglo en letras*/
   static void letras (int arreglo[]){
        char[] arreglo_C = new char[arreglo.length];
        int i;
        for (i = 0;i<arreglo.length;i++ )
        {
            arreglo_C[i] = (char) arreglo[i];
        }
                
        /*******************************/
        
        System.out.println (" ");
               
        imprime_arr1 (arreglo_C);//el arreglo debe de ser tipo char
        
    } 
    
    
    
    public static void main(String[] args) {
        
        
        //Mostrar el arreglo
        char[] arreglo_nombre={'V','I','C','T','O','R'};
        char[] arreglo_paterno={'U','R','I','B','E'};
        char[] arreglo_materno={'J','A','L','P','A'};
        
        
        System.out.println (" ");
        //burbuja(arreglo_nombre);
        //OrdenInsercion(arreglo_paterno);
        ordenSeleccion(arreglo_materno);
        //arreglo_num(arreglo_nombre);
        
        System.out.println (" ");
         System.out.println ("\n\n"); 
    }

    

    
}
