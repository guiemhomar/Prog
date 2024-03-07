/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.clase.abstaacta.figura;
import java.lang.Math;

public class Rectangulo extends Figura {
    
   private double base;
   private double altura;
 
    public Rectangulo (double base, double altura) {
        this.base = base ;
        this.altura = altura;
    }
    
    public double calcularArea(){
        return base * altura ;
    }
    
    public double calcularPerimetro(){
        return base * 2 + altura * 2 ;
    }
}