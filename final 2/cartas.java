/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.pkg2;


public class cartas {
    public enum CartaTipo{
        ATAQUE, CURA, ATURDIR
    }
    
    private String nombre;
    private CartaTipo tipo;
    private int ataque;
    
    public void mostrarInfo() {
    System.out.println("Nombre de la carta: " + nombre);
    System.out.println("Tipo de la carta: " + tipo);
    System.out.println("Ataque de la carta: " + ataque);
}
}
