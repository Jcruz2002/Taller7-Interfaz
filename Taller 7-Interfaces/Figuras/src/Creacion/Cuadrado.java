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
public class Cuadrado extends Figura {
    
    
    public Cuadrado(String color){
        super(color);
    }

    @Override
    public void cambiarColor(String C) {
        System.out.println("Cambiando color de Cuadrado "+super.getColor()+" a " + C);
        super.setColor(C);
    }

    @Override
    public void Color() {
        
        System.out.println("Cuadrado de color "+super.getColor());
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando cuadrado de color "+super.getColor());
    }

    @Override
    public void borrar() {
        
        System.out.println("Borrando cuadrado de color "+super.getColor());
        
    }

  
    
    
}
