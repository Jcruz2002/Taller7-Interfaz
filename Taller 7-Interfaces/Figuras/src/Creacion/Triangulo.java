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
public class Triangulo extends Figura {
    
    public Triangulo(String color){
        
        super(color);
      
    }

    @Override
    public void cambiarColor(String C) {
        System.out.println("Cambiando color de Triangulo "+super.getColor()+" a "+C);
        super.setColor(C);
    }

    @Override
    public void Color() {
        System.out.println("Triangulo de color "+super.getColor());
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Triangulo de color "+super.getColor());
    }

    @Override
    public void borrar() {
        System.out.println("Borrando Triangulo de color "+super.getColor());
    }
    
    
    
}
