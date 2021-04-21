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
public abstract class Aparato {
    
    private int Consumo;
    private int precio;

    public Aparato(int Consumo, int precio) {
        this.Consumo = Consumo;
        this.precio = precio;
    }

    /**
     * @return the Consumo
     */
    public int getConsumo() {
        return Consumo;
    }

    /**
     * @param Consumo the Consumo to set
     */
    public void setConsumo(int Consumo) {
        this.Consumo = Consumo;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
