/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej.clase.array.de.array1;

/**
 *
 * @author alumne-DAM
 */
public class EjClaseArrayDeArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabla [][] = {
            {1,1,1,},
            {2,2,2,},
            {3,3,3,} };
        
        int resultado = 0;
       
       int i = 0;
       while (i < tabla.length){
           
            int j =0;
            while (j < tabla[i].length)
                resultado = resultado + tabla[i][j];
                
            j++;
            }       
               
            i++; 
           System.out.println( resultado);
       }
   
    }
    

