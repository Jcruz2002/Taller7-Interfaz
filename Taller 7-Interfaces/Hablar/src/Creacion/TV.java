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
public class TV extends Aparato implements Hablador{
    
    private String Teletexto;
    private int Antiguedad;

    public TV(String Teletexto, int Antiguedad, int Consumo, int precio) {
        super(Consumo, precio);
        this.Teletexto = Teletexto;
        this.Antiguedad = Antiguedad;
    }

    /**
     * @return the Teletexto
     */
    public String getTeletexto() {
        return Teletexto;
    }

    /**
     * @param Teletexto the Teletexto to set
     */
    public void setTeletexto(String Teletexto) {
        this.Teletexto = Teletexto;
    }

    /**
     * @return the Antiguedad
     */
    public int getAntiguedad() {
        return Antiguedad;
    }

    /**
     * @param Antiguedad the Antiguedad to set
     */
    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    @Override
    public void Hablar() {
        
        System.out.println("Hola soy una TV y sé hablar");
        System.out.println("Consumo          : "+super.getConsumo()+"Kw");
        System.out.println("Precio           : "+super.getPrecio());
        System.out.println("Teletexto[SI/NO] : "+this.Teletexto);
        System.out.println("Antiguedad       : "+this.Antiguedad);
    }
    
    
    
    
    
}
