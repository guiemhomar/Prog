/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal.pkg2;


public class ronda {
    public static void jugarRonda (personaje jugador1, personaje jugador2){
        System.out.println("Info de la partida");
        System.out.println("Jugador 1: " + jugador1.getNombre() + " - vida: " + jugador1.getVida());
        System.out.println("Jugador 2: " + jugador2.getNombre() + " - vida: " + jugador2.getVida());
        
        if(turnoJugador1) {
            System.out.println("Turno de " + jugador1.getNombre());
        }
        else
            System.out.println("Turno de " + jugador2.getNombre());
           
    
    }

}