/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneopadelparejas;

/**
 * Partido de Padel entre 2 parejas
 */

public class Partido {
    private Integer id; //Autogenerado al crear el equipo
    
    private Pareja pareja1; //Equipo local
    private Pareja pareja2; //Equipo visitante
    private Integer ronda;
    
    //No utilizados en las funciones implementadas hasta la fecha:
    private String resultado;
    private Pareja ganadores;

    //Constructor
    public Partido(Integer id, Pareja pareja1, Pareja pareja2, 
            String resultado, Pareja ganadores, Integer ronda) {
        this.id = id;
        this.pareja1 = pareja1;
        this.pareja2 = pareja2;
        this.resultado = resultado;
        this.ganadores = ganadores;
        this.ronda = ronda;
    }
          
    //Getter y setters necesarios:
    public Integer getRonda(){
        return ronda;
    }
    
    /**
     * Pinta la información del partido de padel.
     */
    public void pintarInformacion(){
        System.out.println("Equipo Local: " + pareja1.getId());
        if(pareja2 == null){
            System.out.println("No tenemos equipo Visitante!");
        } else {
            System.out.println("Equipo Visitante: " + pareja2.getId());
        }
        System.out.println("Ronda: " + ronda);
    }
}

