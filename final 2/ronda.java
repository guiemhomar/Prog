/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.pkg2;

import java.util.Random;
import java.util.Scanner;

public class Ronda {

    public static void jugarRonda(Personaje jugador1, Personaje jugador2) {
        Scanner scanner = new Scanner(System.in);

        /*boolean turnoJugador1 = true;
        decidirPrimerTurno(jugador1, jugador2); // Llamamos al método para decidir el primer turno*/

        System.out.println("Info de la partida");
        jugador1.mostrarInfo();
        jugador2.mostrarInfo();

        System.out.println(" ");
        System.out.println(jugador1.getNombre() + ", elige una carta para jugar:");
        Carta cartaJugador1 = jugador1.elegirCarta();

        System.out.println(" ");
        System.out.println(jugador2.getNombre() + ", elige una carta para jugar:");
        Carta cartaJugador2 = jugador2.elegirCarta();

        System.out.println(jugador1.getNombre() + " juega " + cartaJugador1.getNombre());
        jugador1.aplicarEfecto(cartaJugador1, jugador2);

        System.out.println(jugador2.getNombre() + " juega " + cartaJugador2.getNombre());
        jugador2.aplicarEfecto(cartaJugador2, jugador1);

        if (jugador1.isAturdido() && jugador2.isAturdido()) {
            System.out.println("Ambos jugadores estan aturdidos. Se pierde el turno.");
            jugador1.setAturdido(false);
            jugador2.setAturdido(false);
        } else if (jugador1.isAturdido()) {
            System.out.println(jugador1.getNombre() + " esta aturdido. Pierde el turno.");
            jugador1.setAturdido(false);
        } else if (jugador2.isAturdido()) {
            System.out.println(jugador2.getNombre() + " esta aturdido. Pierde el turno.");
            jugador2.setAturdido(false);
        }

        System.out.println(" ");
        System.out.println("Despues de la ronda:");
        System.out.println(" ");
        jugador1.mostrarInfo();
        jugador2.mostrarInfo();
    }
    
    /*public static boolean decidirPrimerTurno(Personaje jugador1, Personaje jugador2) {
        Random moneda = new Random();
        int caraMoneda = moneda.nextInt(2);
        boolean turnoJugador1;
        if (caraMoneda == 1) {
            turnoJugador1 = true; // Cara: jugador 1 empieza
            System.out.println("Ha salido Cara, por tanto va a empezar " + jugador1.getNombre() + "!!!!");
        } else {
            turnoJugador1 = false; // Cruz: jugador 2 empieza
            System.out.println("Ha salido Cruz, por tanto va a empezar " + jugador2.getNombre() + "!!!");
        }
        return turnoJugador1; // Devolvemos el valor de la variable
    }*/
}