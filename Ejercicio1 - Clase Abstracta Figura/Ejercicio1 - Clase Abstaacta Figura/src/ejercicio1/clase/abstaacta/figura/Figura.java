/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.clase.abstaacta.figura;

/**
 *
 * @author alumne-DAM
 */
public abstract class Figura {

    abstract public double calcularArea();
    abstract public double calcularPerimetro();
    
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4);
        Cuadrado cuadrado = new Cuadrado(8);
        Rectangulo rectangulo = new Rectangulo(2,7);
        
        System.out.println("El area del Circulo es: " + circulo.calcularArea());
        System.out.println("El perimetro del Circulo es: " + circulo.calcularPerimetro());
        
        System.out.println("El area del Cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El perimetro del Cuadrado es: " + cuadrado.calcularPerimetro());
        
        System.out.println("El area del Rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El perimetro del Rectangulo es: " + rectangulo.calcularPerimetro());
    }
}
