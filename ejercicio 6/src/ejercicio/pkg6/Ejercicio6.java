/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

import java.util.Scanner;
public class Ejercicio6 {

    
    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
        System.out.println("introduce una velocidad en km/h");
        float velocidad=sc.nextFloat();
        float velocidadfinal=velocidad*1000/3600;
        System.out.println("La longitud es " + velocidadfinal);
    }
    
}
