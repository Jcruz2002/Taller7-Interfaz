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
public class Radio extends Aparato implements Hablador {
    
    private String Cassete;
    private int potencia;

    public Radio(String Cassete, int potencia, int Consumo, int precio) {
        super(Consumo, precio);
        this.Cassete = Cassete;
        this.potencia = potencia;
    }

    /**
     * @return the Cassete
     */
    public String getCassete() {
        return Cassete;
    }

    /**
     * @param Cassete the Cassete to set
     */
    public void setCassete(String Cassete) {
        this.Cassete = Cassete;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void Hablar() {
        System.out.println("Hola soy una Radio y sé hablar");
        System.out.println("Consumo        : "+super.getConsumo()+"Kw");
        System.out.println("Precio         : "+super.getPrecio());
        System.out.println("Casette[SI/NO] : "+this.Cassete);
        System.out.println("Potencia       : "+this.potencia);
    }
    
    
    
}
