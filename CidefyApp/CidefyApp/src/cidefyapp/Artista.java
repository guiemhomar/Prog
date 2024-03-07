/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cidefyapp;

public class Artista {

    private String nombre;
    EstiloMusical estilo;
    private String cancion;
    private int oyentes;
    private String pais;

    public Artista(String nombre, EstiloMusical estilo, String cancion, int oyentes, String pais) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.cancion = cancion;
        this.oyentes = oyentes;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public EstiloMusical getEstilo() {
        return estilo;
    }

    public String getCancion() {
        return cancion;
    }

    public int getOyentes() {
        return oyentes;
    }

    public String getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstilo(EstiloMusical estilo) {
        this.estilo = estilo;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public void setOyentes(int oyentes) {
        this.oyentes = oyentes;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void pintarInformacion() {
        System.out.println("Esta es la informacion del artista: ");
        System.out.println("El nombre del artista es: " + getNombre() + ".");
        System.out.println("Su estilo musical es el " + getEstilo() + ".");
        System.out.println("Su cancion mas escuchada es " + getCancion() + ".");
        System.out.println("Tiene" + getOyentes() + " oyentes mensuales.");
       
    }
}

