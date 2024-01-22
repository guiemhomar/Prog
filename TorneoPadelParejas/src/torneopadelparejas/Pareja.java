/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneopadelparejas;

/**
 * Equipo formado por 2 personas (Torneo de Padel)
 */

public class Pareja {
     private Integer id; //Autogenerado al crear la pareja
    
    private String persona1; //nombre de la persona
    private String persona2; //nombre de la persona
    private String telefono;
    
    //Constructor
    public Pareja(Integer id, String persona1, String persona2, String telefono){
        this.id = id;
        this.persona1 = persona1;
        this.persona2 = persona2;
        this.telefono = telefono;
    }
    
    //Getters necesarios:
    public Integer getId(){
        return id;
    }
    
    /**
     * Punta la información de la pareja.
     * 
     * Pareja {id} : {nombre1} - {nombre2}
     */
    public void pintarInformacion(){
        System.out.println("Pareja " + id + " : " + persona1 + " - " + persona2);
    }
}

