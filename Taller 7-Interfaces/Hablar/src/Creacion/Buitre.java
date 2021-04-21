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
public class Buitre extends Ave{
    
    private float velocidad;
    private float Peso;

    public Buitre(float velocidad, float Peso, String Sexo, int Edad) {
        super(Sexo, Edad);
        this.velocidad = velocidad;
        this.Peso = Peso;
    }

    /**
     * @return the velocidad
     */
    public float getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the Peso
     */
    public float getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(float Peso) {
        this.Peso = Peso;
    }
    
    
}
