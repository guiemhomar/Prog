/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal.pkg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Final2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido/a a HeroSlay!");
        System.out.println("Porfavor ingresa el nombre del Jugador 1:");
        String nombreJugador1 = scanner.nextLine();
        
        System.out.println("Porfavor ingresa el nombre del Jugador 2:");
        String nombreJugador2 = scanner.nextLine();
        
        Personaje jugador1 = new Personaje(nombreJugador1);
        Personaje jugador2 = new Personaje(nombreJugador2);
        
        /*boolean turnoJugador1 = Ronda.decidirPrimerTurno(jugador1, jugador2);*/

        Carta c1 = new Carta("Ventisca Eterna", Carta.CartaTipo.ATAQUE, 50);
        Carta c2 = new Carta("Mano Celestial", Carta.CartaTipo.ATURDIR, 10);
        Carta c3 = new Carta("Plegaria Lunar", Carta.CartaTipo.CURA, 40);

        jugador1.agregarCarta(c1);
        jugador1.agregarCarta(c2);
        jugador1.agregarCarta(c3);

        jugador2.agregarCarta(c1);
        jugador2.agregarCarta(c2);
        jugador2.agregarCarta(c3);

        boolean turnoJugador1 = true;
        while (jugador1.getVida() > 0 && jugador2.getVida() > 0) {
            System.out.println("Nueva ronda:");
            Ronda.jugarRonda(jugador1, jugador2);
            turnoJugador1 = !turnoJugador1;
        }

        if (jugador1.getVida() > 0) {
            System.out.println("Esta no te la esperabas!");
            System.out.println("¡" + jugador1.getNombre() + " GANA!");
        } else {
            System.out.println("Tomate esta!");
            System.out.println("Perdiste: " + jugador2.getNombre() + " Gana");
        }
    }
}
