/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorasimple;

public class CalculadoraSimple {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        int suma = add(a, b);
        System.out.println("La suma de " + a + " y " + b + " es " + suma);

        int division = divide(a, b);
        System.out.println("La división de " + a + " por " + b + " es " + division);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }
}
