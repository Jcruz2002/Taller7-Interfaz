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
public abstract class Figura implements Coloreable {
    
    private String color;
    
    public Figura(String color){
        
        this.color=color;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
   

    @Override
    public abstract void cambiarColor(String C);

    @Override
    public abstract void Color();
    
    public abstract void dibujar();
    
    public abstract void borrar();
    
}
