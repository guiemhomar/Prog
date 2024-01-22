/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package llibres;


public class Llibres {

    private String autor;
    private String titol;
    private double qualificacio;

    public Llibres(String autor, String titol, double qualificacio) {
        this.autor = autor;
        this.titol = titol;
        setQualificacio(qualificacio);    
    }

    public String getAutor() {
        return autor;
    }

    public String getTitol() {
        return titol;
    }

    public double getQualificacio() {
        return qualificacio;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setQualificacio(double qualificacio) {
        if(qualificacio >= 0 && qualificacio <= 10) {
            this.qualificacio = qualificacio;
        }
        else{
            System.out.println("Qualificació ha de ser superior a 0 i inferior a 10");
        }
    }
    public static void main(String[] args) {
        
    }
    
}
