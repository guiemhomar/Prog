/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.pkg2;

import java.util.List;

public class personaje {
    private String nombre;
    private int vida;
    private List<cartas> mazo;
    
    public personaje (String nombre, int vida, List<cartas> mazo) {
        this.nombre = nombre;
        this.vida = vida;
        this.mazo = mazo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public List<cartas> getMazo() {
        return mazo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setMazo(List<cartas> mazo) {
        this.mazo = mazo;
    }
    
    //para mostrar la info de los personajes
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Cartas en el mazo:");
        for (cartas carta : mazo) {
            carta.mostrarInfo();
            System.out.println("----------");
        }
    }
}

