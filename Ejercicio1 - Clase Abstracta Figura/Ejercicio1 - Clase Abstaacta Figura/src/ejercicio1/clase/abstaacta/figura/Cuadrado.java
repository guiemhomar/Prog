/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.clase.abstaacta.figura;
import java.lang.Math;

public class Cuadrado extends Figura {
    
   private double lado;
 
    public Cuadrado (double lado) {
        this.lado = lado ;
    }
    
    public double calcularArea(){
        return lado * lado ;
    }
    
    public double calcularPerimetro(){
        return 4 * lado ;
    }
}