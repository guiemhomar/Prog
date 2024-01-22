package practica.monkey.island;

import java.util.Random;
import java.util.Scanner;

public class PracticaMonkeyIsland {

    static boolean Guybrush = true; //Guybrush soc jo i pirata del bosc es l'ordenador
    static int marcadorGuybrush = 0; //Cadascun comença amb 0 punts
    static int marcadorPirataDelBosque = 0; //cadascun comença amb 0 punts

    public static void main(String[] args) {

        titulo();//titol del joc
        inicio(); //se decideix qui comença mitjançant el cara o creu

        //empieza el el juego
        while (marcadorGuybrush < 3 && marcadorPirataDelBosque < 3) {
            if (Guybrush == true) {//quan surt cara comença el Guybrush
                empiezaGuybrush(); 

            } else { //quan surt creu
                empiezaPirataDelBosque();

            }
            cambio(); //quan acaba el torn perque canvii qui xerra primer
        }
        Final();//marcadors finals i qui ha guanyat

    }

    public static void titulo() { //titol per introduir el joc
        System.out.println("              MONKEY ISLAND 1              ");
        System.out.println(" ");
        System.out.println("/Primera pelea: Guybrush VS PirataDelBosque/");
        System.out.println("----------------------------------------------");
    }

    public static void inicio() { //la clase per fer el cara o creu amb algun sout per posar context
        System.out.println("narrador: Esto empieza yaaaa muchachos!");
        System.out.println("narrador: 'Se hace sorteo Cara o Cruz para elegir quien empieza'");
        System.out.println("-Guybrush elige Cara y PirataDelBosque elige Cruz-");

        Random moneda = new Random();
        int caraMoneda = moneda.nextInt(2); //random amb dos numeros, un es cara i s'altre es creu

        if (caraMoneda == 1) {
            Guybrush = true; //establim qui es cara 
            System.out.println("narrador: Ha salido Cara, por tanto va a empezar el Guybrush!!!!");
        } else if (caraMoneda == 0) { //establim qui es creu
            Guybrush = false;
            System.out.println("narrador: Ha salido Cruz, por tanto va a empezar el PirataDelBosque!!!");
        }

    }

    public static void empiezaGuybrush() { //aquest es el cas on començam noltros

        System.out.println(" ");
        System.out.println("Guybrush: Te vas a enterar Pirata del Bosque!");
        String[] insultosJugador1 = new String[4]; //string amb els diferents insults disponibles
        insultosJugador1[0] = "Has dejado ya de usar paquete?";
        insultosJugador1[1] = "No hay palabras para describir lo asqueroso que eres!";
        insultosJugador1[2] = "He hablado con simios mas educados que tu!";
        insultosJugador1[3] = "Llevaras mi espada como si fueras un pincho moruno!";

        Scanner insultoGuybrush = new Scanner(System.in); //un escaner per que el numero seleccionat surti a la consola
        System.out.println(" ");
        System.out.println("Cual de los insultos quieres usar?");
        System.out.println("-----------------------------------");
        System.out.println("Insulto numero 0: " + insultosJugador1[0]);
        System.out.println("Insulto numero 1: " + insultosJugador1[1]);
        System.out.println("Insulto numero 2: " + insultosJugador1[2]);
        System.out.println("Insulto numero 3: " + insultosJugador1[3]);

        int insultosGuybrush = insultoGuybrush.nextInt(); 
        switch (insultosGuybrush) { //un switch case per no haver de fer if,else tantes vegades i poder reduir la feina 
            case 0 ->
                System.out.println("Guybrush: Has dejado ya de usar paquete?");
            case 1 ->
                System.out.println("Guybrush: No hay palabras para describir lo asqueroso que eres!");
            case 2 ->
                System.out.println("Guybrush: He hablado con simios mas educados que tu!");
            case 3 ->
                System.out.println("Guybrush: Llevaras mi espada como si fueras un pincho moruno!");

        }

        System.out.println(" ");
        System.out.println("TURNO DE LA RESPUESTA:");
        System.out.println(" ");
        System.out.println("PirataDelBosque: Ahora me toca a mi mequetrefe");

        String[] insultosJugador2 = new String[4]; //el torn de la resposta i quins son els insults disponibles per el que respon
        insultosJugador2[0] = "Por que? Acaso querias pedir uno prestado?";
        insultosJugador2[1] = "Si que las hay, solo que nunca las has aprendido.";
        insultosJugador2[2] = "Me alegra que asistieras a tu reunion familiar diaria.";
        insultosJugador2[3] = "Primero deberias dejar de usarla como un plumero.";

        Random insultoPirataDelBosque = new Random();
        int respuestaPirataDelBosque = insultoPirataDelBosque.nextInt(4); //un random de 4 numeros perque quan surti X es realitzi l'insult respectiu

        System.out.println("PirataDelBosque: " + insultosJugador2[respuestaPirataDelBosque]);

        if (insultosGuybrush == respuestaPirataDelBosque) { //un if per saber que ha de passar per a que guanyi el pirata, y poder sumar al marcador la puntuacio corresponent
            marcadorPirataDelBosque++;
            System.out.println(" ");
            System.out.println("RESPUESTA CORRECTA!!!!");
            System.out.println("El macador del PirataDelBosque es: " + marcadorPirataDelBosque);
            System.out.println("El marcador del Guybrush es: " + marcadorGuybrush);
        } else if (insultosGuybrush != respuestaPirataDelBosque) { //un else per si guanyes l'altre cas i que tambe es sumes al marcador la puntacio corresponent
            marcadorGuybrush++;
            System.out.println(" ");
            System.out.println("RESPUESTA INCORRECTA!!!");
            System.out.println("El marcador del Guybrush es: " + marcadorGuybrush);
            System.out.println("El marcador del PiratDelBosque es: " + marcadorPirataDelBosque);
        }
    }

    public static void empiezaPirataDelBosque() { //el cas on surt creu i comença el pirata del bosc

        System.out.println(" ");
        System.out.println("PirataDelBosque: Ahora me toca a mi y veras quien manda!");

        String[] insultosJugador1 = new String[4]; //una altra vegada els insults disponibles per al primer torn
        insultosJugador1[0] = "PirataDelBosque: Has dejado ya de usar paquete?";
        insultosJugador1[1] = "PirataDelBosque: No hay palabras para describir lo asqueroso que eres!";
        insultosJugador1[2] = "PirataDelBosque: He hablado con simios mas educados que tu!";
        insultosJugador1[3] = "PirataDelBosque: Llevaras mi espada como si fueras un pincho moruno!";

        Random insultoPirataDelBosque = new Random();
        int respuestaPirataDelBosque = insultoPirataDelBosque.nextInt(4); // el random amb els 4 numeros

        System.out.println(insultosJugador1[respuestaPirataDelBosque]);

        System.out.println(" ");
        System.out.println("TURNO DE LA RESPUESTA: ");
        System.out.println("Guybrush: Ahora veras pirata pocho");
 
        String[] insultosJugador2 = new String[4]; // la resposta amb els seus insults
        insultosJugador2[0] = "Por que? Acaso querias pedir uno prestado?";
        insultosJugador2[1] = "Si que las hay, solo que nunca las has aprendido.";
        insultosJugador2[2] = "Me alegra que asistieras a tu reunion familiar diaria.";
        insultosJugador2[3] = "Primero deberias dejar de usarla como un plumero.";

        Scanner insultoGuybrush = new Scanner(System.in); //escaner per llegir l'insult seleccionat
        System.out.println(" ");
        System.out.println("Cual de los insultos quieres usar?");
        System.out.println("-----------------------------------");
        System.out.println("Insulto numero 0: " + insultosJugador2[0]);
        System.out.println("Insulto numero 1: " + insultosJugador2[1]);
        System.out.println("Insulto numero 2: " + insultosJugador2[2]);
        System.out.println("Insulto numero 3: " + insultosJugador2[3]);

        int insultosGuybrush = insultoGuybrush.nextInt();
        switch (insultosGuybrush) {
            case 0 ->
                System.out.println("Guybrush: Por que? Acaso querias pedir uno prestado?");
            case 1 ->
                System.out.println("Guybrush: Si que las hay, solo que nunca las has aprendido.");
            case 2 ->
                System.out.println("Guybrush: Me alegra que asistieras a tu reunion familiar diaria.");
            case 3 ->
                System.out.println("Guybrush: Primero deberias dejar de usarla como un plumero.");
        }

        if (insultosGuybrush == respuestaPirataDelBosque) { //un if per al marcador i per a veure qui ha guanyat
            marcadorGuybrush++;
            System.out.println(" ");
            System.out.println("RESPUESTA CORRECTA!!!!");
            System.out.println("El marcador del Guybrush es: " + marcadorGuybrush);
            System.out.println("El marcador del PiratDelBosque es: " + marcadorPirataDelBosque);
        } else if (insultosGuybrush != respuestaPirataDelBosque) { // un else per si guanyes l'altra usuari i tambe es sumes al seu marcador
            marcadorPirataDelBosque++;
            System.out.println(" ");
            System.out.println("RESPUESTA INCORRECTA!!!");
            System.out.println("El marcador del PiratDelBosque es: " + marcadorPirataDelBosque);
            System.out.println("El marcador del Guybrush es: " + marcadorGuybrush);
        }
    }

    public static void Final() { //un if per quan el marcador arribi a 3 que guanyi aquest usuari i un parell de souts
        if (marcadorGuybrush == 3) {
            System.out.println(" ");
            System.out.println("El ganador del combate es: GUYYYYBRUUUUUUUSHHH!!! ");
            System.out.println("Con un marcador de " + marcadorGuybrush + " puntos y el marcador PirataDelBosque: " + marcadorPirataDelBosque + " puntos.");
        } else if (marcadorPirataDelBosque == 3) { //un else per si guanyes l'altre usuari i un parell de souts 
            System.out.println("El ganador del combate es: el pirata del bosque pocho :/");
            System.out.println("Con un marcador de " + marcadorPirataDelBosque + " puntos y el marcador del Guybrush: " + marcadorGuybrush + " puntos.");
        }
        System.out.println("Tremendo combate acabamos de presenciar, nos vemos en el siguiente.");

    }

    public static void cambio() { //if per poder fer el canvi de torn, si es true, que llavor sigui false per tant comencis al seguent torn, i al contrari, si era false que se torni true, per poder començar al seguent torn
        if (Guybrush == true) {
            Guybrush = false;
        } else {
            Guybrush = true;
        }
    }

}


