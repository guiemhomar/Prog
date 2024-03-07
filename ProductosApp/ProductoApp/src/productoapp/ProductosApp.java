/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productoapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author alumne-DAM
 */
public class ProductosApp {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<Integer, Producto> inventario = new HashMap<>();
        
        String pathAbsoluto = "C:\\Users\\alumne-DAM\\Documents\\NetBeansProjects\\ProductoApp\\src\\productoapp\\productos.txt";
        BufferedReader br = new BufferedReader (new FileReader(pathAbsoluto));
        
        String text = br.readLine();
        while (text != null) {
            String [] linia = text.split(",");
            
            System.out.println(linia[0]);
            System.out.println(linia[1]);
            System.out.println(linia[2]);
            text = br.readLine();
            
        }
    }
    
}
