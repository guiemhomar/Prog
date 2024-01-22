/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dislaflota.ej;


import java.util.Scanner;
public class DislaflotaEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean [][] tablero = {
            {true, false, false, false, false},
            {false, false, true, false, true},
            {false, true, false, false, false},
            {true, false, false, false, false},
            {false, false, true, true, false}
        };
        int barcosHundidos=0;
        
        int i = 5;
        while (i >= 0 && barcosHundidos <= 5){
            System.out.println("Introduce una coordenada X");
            int X = sc.nextInt();
            System.out.println("Introduce una coordenada Y");
            int Y = sc.nextInt();
            
            if(tablero [X][Y]==true){
                System.out.println("Hundido "+ i+ " intentos restantes");
                barcosHundidos++;
                i--;
               tablero [X][Y] = false; 
            }
                else{
                System.out.println("Agua "+ i+ " intentos restantes");
                i = i -1;
            }
           
    }
        int Agua = 5 - barcosHundidos; 
        System.out.println("Has hundido "+ barcosHundidos+ " y has fallado "+ Agua);
        
    }
}
    
