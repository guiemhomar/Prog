/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioparapracticarlaslistas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class EjercicioParaPracticarLasListas {

    
    public static void main(String[] args) {
        List<String> listaDias = new ArrayList<>(List.of("Lunes", "Martes", "Miercoles", "Jueves", "Vierrnes", "Sábado", "Domingo"));
        
        listaDias.add(3, "Juernes");
        
        List<String> listaDos = new ArrayList(listaDias);
        
        listaDias.addAll(listaDos);
        
        System.out.println("Posicion 3: " + listaDias.get(3));
        System.out.println("Posicion4: " + listaDias.get(4));
        
        System.out.println("Posicion inicial: " + listaDias.get(0));
        int ultimaPosicion = listaDias.size() -1;
        System.out.println("Posicion final: " + listaDias.get(ultimaPosicion));
        
        listaDias.remove(4);
        System.out.println("Posicion 4 update. " + listaDias.get(4));
        
        
        //for (int i =0; i<listaDias.size(); i++){
        //System.out.println(dias.get(i));
        
        for(String dia : listaDias){
            System.out.println(dia);
        }
        
        System.out.println(listaDias.contains("Lunes"));
        
        boolean encontrado = false;
        for(String dia : listaDias) {
            if(!encontrado){
            encontrado = dia.toUpperCase().equals("lunes".toUpperCase());
            }
        }    
        Collections.reverse(listaDias);
        System.out.println(listaDias);
        
        listaDias.sort(null);
        System.out.println(listaDias);
        
        listaDias.clear();
        System.out.println(listaDias);
          
    }
}
