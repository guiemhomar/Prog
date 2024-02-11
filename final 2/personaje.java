/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.pkg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Personaje {

    private String nombre;
    private int vida;
    private List<Carta> mazo;
    private boolean aturdido;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.mazo = new ArrayList<>();
        this.aturdido = false;
    }

    public boolean isAturdido() {
        return aturdido;
    }

    public void setAturdido(boolean aturdido) {
        this.aturdido = aturdido;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Cartas en el mazo:");
        System.out.println("----------");
        for (Carta carta : mazo) {
            carta.mostrarInfo();
            System.out.println("----------");
        }
    }

    public void agregarCarta(Carta carta) {
        mazo.add(carta);
    }

    public Carta elegirCarta() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Elige una carta para jugar:");
        for (int i = 0; i < mazo.size(); i++) {
            System.out.println((i + 1) + ". " + mazo.get(i).getNombre());
        }
        opcion = scanner.nextInt();
        if (opcion < 1 || opcion > mazo.size()) {
            System.out.println("Opcion invalida. Intentalo de nuevo.");
            return elegirCarta();
        } else {
            return mazo.get(opcion - 1);
        }
    }
    
    public void aplicarEfecto(Carta carta, Personaje objetivo) {
        switch (carta.getTipo()) {
            case ATAQUE:
                objetivo.recibirAtaque(carta.getAtaque());
                break;
            case CURA:
                this.curar(carta.getAtaque());
                break;
            case ATURDIR:
                objetivo.setAturdido(true);
                break;
            default:
                System.out.println("Tipo de carta no reconocido.");
        }
    }

    public void recibirAtaque(int ataque) {
        this.vida -= ataque;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public void curar(int cantidad) {
        this.vida += cantidad;
        if (this.vida > 100) {
            this.vida = 100;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public List<Carta> getMazo() {
        return mazo;
    }
}

