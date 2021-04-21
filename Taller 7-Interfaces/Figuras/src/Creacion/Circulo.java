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
public class Circulo extends Figura {
    
    public Circulo(String color){
        super(color);
    }

    @Override
    public void cambiarColor(String C) {
        System.out.println("Cambiando color de Circulo "+super.getColor()+" a "+C);
        super.setColor(C);
    }

    @Override
    public void Color() {
        System.out.println("Circulo de color "+super.getColor());
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo de color "+super.getColor());
    }

    @Override
    public void borrar() {
        System.out.println("Borrando circulo de color "+super.getColor());
    }
    
    
}
