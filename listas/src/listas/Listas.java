/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Listas {

    
    public static void main(String[] args) {
        
        /*List<String> semana = new ArrayList<>();    
        semana.add("Lunes");
        semana.add("Martes");
        */
        
        ejercicioSemana();
    }    
    public static void ejercicioSemana(){
        List<String> semana = Arrays.asList("Lunes", "Martes", "Miercoles");
        
        for(String dia : semana){
            System.out.println(dia);
        }
        
        //semana.forEach(dia -> System.out.println(dia));
    }
    public static void ejercicio2Arrays(){
        
        List<Integer> numeros = new ArrayList<>(
            Arrays.asList(1,2,3,4,5));
        
        int suma = 0;
        for(int i =0; i<numeros.size(); i++){
            Integer n = numeros.get(i);
            //Si n es par:
            if(){
                //multplica por dos y suma
            } else {
                //suma
            }   
        }
        System.out.println("El resultado es: " + suma);
    }
        
    }   
        
        
        
        
        
    
    

