/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capicua.si.o.no;


public class CapicuaSiONo {

    
    public static void main(String[] args) {
        String frase = "annna";
        char [] array1 = frase.toCharArray();
        boolean esCapicua = true;
        int inicio = 0;
        int fin = 2;
        while (inicio < array1.length/2) {
            if(array1[inicio] == array1[fin]){
                esCapicua = true;
            } else {
                esCapicua = false ;
                
            }
            inicio++;
            fin--;
        }
        System.out.println("Es capicua? "+ esCapicua);
            
    }
    
}
