/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cidefyapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe representa la lista de Artistas.
 * Debereis programar cada uno de los métodos con su funcionalidad.
 * Debereis crear el enum EstiloMusical y la classe Artista según el enuncuado.
 * Autor: 
 */
public class ColeccionArtistas {
    
    List<Artista> artistas = new ArrayList<>();
    
    /* No modificar */
    public ColeccionArtistas(List<Artista> artistas){
        this.artistas = artistas;
    }
    
    /* No modificar */
    public ColeccionArtistas(){
        this.artistas = new ArrayList<>();
    }
    
    //Debeis implementar los siguientes métodos:
    
    /**
     * Añade un nuevo artista a la colección.
     * El nuevo artista vendrá dado por parámetros.
     */
    public void añadirArtista(Artista artista){
       artistas.add(artista);
       
    }
    
    /**
     * Pinta la información de todos los artistas de tu colección.
     * Pista: Utilizar artisa.pintarInformacion()
     */
    public void pintarColeccion(){
        for (Artista artista : artistas) {
            artista.pintarInformacion();
            System.out.println("----------");
        }
    }
    
    /**
     * Pinta por consola la información de un artista a partir de su nombre.
     * Se supone que no habrá varios artistas con el mismo nombre.
     */
    public void pintarArtistaPorNombre(String nombre){
        for(Artista artista: artistas) {
            if (nombre == artista.getNombre()){
                artista.pintarInformacion();
            }
        }   
    }
    
    /**
     * Encuentra y devuelve el Artista de tu colección,
     * a partir del nombre de su canción más destacada.
     * Si no encuentra la canción, debe devolver null.
     */
    public Artista artistaPorCancion(String cancion){
        for(Artista artista: artistas) {
            if (cancion == artista.getCancion()){
                artista.pintarInformacion();
            }
        } 
        return null;
    }
    
    /**
     * Devuelve todos los artistas de tu colección, 
     * que coincidan con el estilo musical pasado por parámetros.
     * Si no encuentra ningún artista, debe devolver una lista vacia.
     */
    public List<Artista> artistasPorEstilo(EstiloMusical estilo){
        for(Artista artista: artistas) {
            if (estilo == artista.getEstilo()){
                artista.pintarInformacion();
            }
        } 
        return new ArrayList<>();
    }
    
    /**
     * Devuelve el artista mas escuchado de tu colección.
     * Si no encuentra ningún artista, devolver null.
     */
    public Artista artistaMasEscuchado(){
        for(Artista artista: artistas) {
            
        } 
        return null;
    }
    
    /**
     * Imprime por pantalla todos los tipos de estilos musicales de la colección.
     * Importante: No deben aparecer repetidos.
     */
    public void pintarEstilosMusicales(){
        
        for(Artista artista: artistas) {
            System.out.println("Los diferentes estilos musicales son: ");
            System.out.println("El primero es el " + EstiloMusical.POP );
            System.out.println("El segundo es el " + EstiloMusical.RAP);
            System.out.println("El ultimo estilo es el " + EstiloMusical.ROCK);
        } 
    }
    
}