/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

import java.util.Scanner;
public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce una temperatura en grados centigrados");
        float grados=sc.nextFloat();
        float Fahrenheit=(grados*9/5)+32;
        System.out.println(Fahrenheit );
        
    }
    
}
