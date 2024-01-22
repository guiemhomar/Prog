/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torneopadelparejas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TorneoPadelParejas {
    
    private final static Scanner escaner = new Scanner(System.in);
    
    public static List<Pareja> parejasTorneo;
    public static Integer MaxIdPareja = 1;
    
    public static List<Partido> partidosTorneo;
    public static Integer MaxIdPartido = 1;
    public static Integer RondaActual = 1;
   
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Nuevo torneo de Padel!");
        System.out.println("----------------------");
        
        parejasTorneo = new ArrayList<>();
        partidosTorneo = new ArrayList<>();
        
        System.out.println("----------------------");
        System.out.println("¿Que deseas hacer?");
        System.out.println("0- Cerrar Aplicación");
        System.out.println("1- Crear Equipo");
        System.out.println("2- Eliminar Equipo");
        System.out.println("3- Pintar Equipos");
        System.out.println("4- Generar ronda de partidos");
        System.out.println("5- Pintar partidos de la ronda");
        System.out.println("6- Anotar resultados");
        System.out.println("7- Ver ganador del partido");
        System.out.println("----------------------");
        
        System.out.print("Selecciona una función: ");
        int funcion = leerNumero();
        
        //Nuestro menú con cada una de las funciones implementadas:
        while(funcion != 0){
            
            switch(funcion){
                case 1: 
                    inscribirPareja();
                    break;
                case 2: 
                    eliminarPareja();
                    break;
                case 3: 
                    pintarParejasTorneo();
                    break;
                case 4: 
                    generarRonda();
                    break;
                case 5: 
                    pintarPartidos();
                    break;
            }
            
            System.out.print("Selecciona una función: ");
            funcion = leerNumero();
        }
            
        System.out.println("Fin del torneo.");
    }
    
    /**
     * Inscribe una pareja al torneo.
     * Se podria mejorar mostrando un mensaje tipo: "Añadido correctamente".
     */
    private static void inscribirPareja(){
        
        //Crear una pareja con su constructor
        Integer id = MaxIdPareja; //Autogenerado
        System.out.print("Nombre del jugador 1: ");
        String nombre1 = escaner.nextLine();
        System.out.print("Nombre del jugador 2: ");
        String nombre2 = escaner.nextLine();
        System.out.print("Telefono de contacto: ");
        String telefono = escaner.nextLine();
        Pareja pareja = new Pareja(id, nombre1, nombre2, telefono);
        
        //Añade la pareja creada a la lista del torneo
        parejasTorneo.add(pareja);
        
        MaxIdPareja++;
        
    }
    
    
    /**
     * Elimina la pareja a partir de su número identificativo (ID).
     * Se podria mejorar mostrando un mensaje en caso de eliminarlo correctamente.
     */
    private static void eliminarPareja(){ 
        System.out.print("El id del Equipo a eliminar: ");
        Integer id = leerNumero();
            
        for(int i = 0; i < parejasTorneo.size(); i++){
            if(id.equals(parejasTorneo.get(i).getId())){
                parejasTorneo.remove(i);
            }
        }
        
        //Forma elegante para eliminar la pareja sin realizar un for():
        //parejasTorneo.removeIf(pareja -> id.equals(pareja.getId()));        
    }
    
    /**
     * Pinta todas las parejas del torneo.
     */
    private static void pintarParejasTorneo(){
        for(Pareja pareja : parejasTorneo){
            pareja.pintarInformacion();
        }
        
        if(parejasTorneo.isEmpty()){
            System.out.println("INFO: No hay ninguna pareja!");
        }
    }
    
    /**
     * Genera una ronda de partidos con las parejas actuales.
     * Se podria mejorar con un emparejamiento aleatorio.
     */
    private static void generarRonda(){ 
        Partido partido;
        int i = 0;
        while(i < parejasTorneo.size()){
            //Si las parejas son inpares y estamos creando el ultimo partido:
            if(parejasTorneo.size() % 2 == 1 && i == parejasTorneo.size() - 1){
                //Creamos un partido con una sola pareja
                partido = new Partido(MaxIdPartido, 
                    parejasTorneo.get(i), 
                    null, null, null, RondaActual);
            } else {
                //Creamos un partido con dos parejas
                partido = new Partido(MaxIdPartido, 
                    parejasTorneo.get(i), 
                    parejasTorneo.get(i + 1), 
                    null, null, RondaActual);
            }
            
            partidosTorneo.add(partido);
            MaxIdPartido++;
            i = i+2;
        }
        RondaActual++;
    }
    
    /*
     * Pinta los partidos de la ronda actual.
     */
    private static void pintarPartidos() {
        for(Partido partido : partidosTorneo){
            if(partido.getRonda() == RondaActual-1){
                partido.pintarInformacion();
            }
        }
    }
    
    /**
     * Función para leer un número mediante el Scanner.
     * Corrige el bug detectado en clase con el scaner.nextInt()
     * 
     * @return 
     */
    private static int leerNumero(){
        return Integer.valueOf(escaner.nextLine());
    }
    
}


