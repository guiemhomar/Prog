/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estanteria;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estanteria {
    List<String> lista = new ArrayList<>(List.of());
        
    public Estanteria() {
        this.lista = new ArrayList<>();
    }
    
    public void afegirLlibres(String llibre){
        if(lista.size() < 10 && !lista.contains(lista)){
            lista.add(llibre);
            System.out.println("Llibre afegit");
        } 
        else{
            System.out.println("No es pot afegir el llibre");
        }
    }
    
    public static void main(String[] args) {
        
        
        
    }   
}
