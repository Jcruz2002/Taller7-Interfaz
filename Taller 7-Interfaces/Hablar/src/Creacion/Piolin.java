/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacion;

/**
 *
 * @author jdavi
 */
public class Piolin extends Canario implements Hablador{
    
    private int NPeliculas;

    public Piolin(int NPeliculas, String Sexo, int Edad, String Canta) {
        super(Sexo, Edad, Canta);
        this.NPeliculas = NPeliculas;
    }

    /**
     * @return the NPeliculas
     */
    public int getNPeliculas() {
        return NPeliculas;
    }

    /**
     * @param NPeliculas the NPeliculas to set
     */
    public void setNPeliculas(int NPeliculas) {
        this.NPeliculas = NPeliculas;
    }

    @Override
    public void Hablar() {
        System.out.println("Hola soy Piolin y sé hablar");
        System.out.println("Sexo        : "+super.getSexo());
        System.out.println("Edad        : "+super.getEdad());
        System.out.println("Canta       : "+super.getCanta());
        System.out.println("N°Peliculas : "+this.NPeliculas);
    }
    
    
}
