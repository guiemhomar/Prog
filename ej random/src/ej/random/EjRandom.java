/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej.random;

import java.util.Random;
public class EjRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Random aleatori = new Random();
         int num  = aleatori.nextInt(5); 
         System.out.println("El numero aleatorio es:" + num);
         
         int num2 = calcularAleatorio(25,30);
    }
    public static void calcularAleatorio(int inicio, int fin){
        Random aleatori = new Random();
        int resultado = inicio + aleatorio.nextInt(fin-inicio);
        return resultado;
        
}
}