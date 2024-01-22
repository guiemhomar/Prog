package examen.pkg1 ;

/**
 * Primer examen de Programación - DAM
 * Guiem Homar Ferri ¿Vuestro nombre?
 * @fecha 26/10/2023 
 */
  import java.util.Scanner;
public class Examen1 {

    /* No tocar este método */
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("-1r Examen de programación 2023/24-");
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 1: ");
        ejercicio1();
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 2: ");
        ejercicio2();
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 3: ");
        ejercicio3();
        System.out.println("-----------------------------------\n");
        System.out.println("Ejercicio 4: ");
        ejercicio4();
    }
    
    /**
     * Enunciado:
     * Calcula el Area de un cuadrado equilátero a partir de uno de sus lados.
     * **
     * Nota: Puedes definir el valor del lado como una variable (no usar Scanner).
     * Nota: Se debe utilizar System.out.print para notificar al usuario.
     * Nota: Ejercicio de clase.
     */
    private static void ejercicio1() {
      int costat = 5;
        System.out.println("El costat del quadrat mesura "+ costat * costat);
       
        
        
              
    }
    
    /**
     * Enunciado:
     * Queremos saber la nota final de un alumno
     * Además, queremos saber si aprobará o no la asignatura
     * El alumno posee 3 notas: 
     * Nota del 1r examen 25%, nota del 2o examen 25% i nota de la práctica 50%
     * Si la media del alumno es superior a 4.5, el alumno estará aprobado.
     * **
     * Nota: Puedes definir las 3 notas como variables (no usar Scanner).
     * Nota: Se debe utilizar System.out.print para notificar al usuario.
     */
    private static void ejercicio2() {
       /** Scanner sc=new Scanner(System.in);
        System.out.println("Posa les tres notes del alumne, les teòriques i les pràctiques, respectivament");
        double nota1=sc.nextDouble();
        double nota2=sc.nextDouble();
        double nota3=sc.nextDouble();
        double resultat=nota1*0.25+nota2*0.25+nota3*0.5;
        if(resultat>=4.5)
            System.out.println("La nota del alumne està aprovada");
        else if(resultat<4.5)
            System.out.println("L'alumne ha suspès");
       */ 
    double nota1=3;
    double nota2=5.6;
    double nota3=6;
    
    double resultat=nota1*0.25+nota2*0.25+nota3*0.5;
        if(resultat>=4.5)
            System.out.println("La nota del alumne està aprovada amb un"+ resultat);
        else if(resultat<4.5)
            System.out.println("L'alumne ha suspès amb un"+ resultat);
          
        
        
    }
    
    /**
     * Enunciado:
     * Crear un contador del 0 al 20, pero que este cuente de 2 en 2
     * Ejemplo: 0, 2, 4, 6, 8, 10, 12, ...
     * **
     * Pista: Utilizar un bucle while() o for().
     */
    private static void ejercicio3() {
        for (int contador = 0; contador <= 20; contador+=2) {
             System.out.println(contador);       
               }
        
        
    }
    
    /**
     * Enunciado:
     * Queremos que a partir de una frase, se cuenten las vocales que contiene
     * Ejemplo: "Hola mundo" - Posee 4 vocales.
     * **
     * Nota: Definir un String con la frase a utilizar (no usar Scanner).
     * Utilizar la función .toCharArray(); para convertir el String a un char[]
     * Pista: Iterar cada char del array para detectar cuantas vocales hay.
     */
    private static void ejercicio4() {
       String frase = "Creo que he aprobado el examen.";
       char[] array = frase.toLowerCase().toCharArray();
       
       int vocales = 0;
       for(int i = 0; i < array.length; i++){
        if(array [i] == 'a' || array [i] == 'e' || array [i] == 'e' || array [i] == 'o' || array [i] == 'i'){
       vocales ++;
    }
       }
        System.out.println("La frase:'" + frase + "'");
        System.out.println("Tiene "+ vocales + " vocales ");
    }
}
