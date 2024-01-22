/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string.buscar.nombre;
import java.util.Scanner;

public class StringBuscarNombre {
    
    
    public static void main(String[] args) {
        String[] nombres = new String [4];
        nombres [0] = "Marc";
        nombres [1] = "Lluc";
        nombres [2] = "Carme";
        nombres [3] = "Pep";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un nom");
        String nom = sc.nextLine();
        
        if (nom .equals(nombres[0])){
            System.out.println("Nom correcte");
        }
        else{
            System.out.println("Nom incorrecte");
        }
    }
    
}
