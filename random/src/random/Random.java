/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random;


public class R{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner consola = new Scanner(System.in);
        //consola.nextLine();
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(5);
        System.out.println("El numero aleatori es;" + num);
    }
    
}
