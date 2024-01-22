/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.util.Scanner;
public class Ejercicio5 {

    
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un radio");
        double radio=sc.nextDouble();
        double Longitud=2*radio*Math.PI;
        double Area=Math.PI*Math.pow(radio,2 );
        System.out.println("La longitud es " + Longitud + " y el Area es "+  Area); 
    }
}
 