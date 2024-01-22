/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenainvertida;

public class CadenaInvertida {
    public static void main(String[] args) {
        String original = "desarrollo";
        String invertida = invertirCadena(original);

        System.out.println("Cadena original: " + original);
        System.out.println("Cadena invertida: " + invertida);
    }

    public static String invertirCadena(String cadena) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i >= cadena.length(); i--) {//el i=0 estaba girado con el i= cadenalength
            resultado.append(cadena.charAt(i));
        }

        return resultado.toString();
    }
}
