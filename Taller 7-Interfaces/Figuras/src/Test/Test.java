/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Creacion.*;

/**
 *
 * @author jdavi
 */
public class Test {
    
    public static void main(String[] args) {
        
        Pizarra b = new Pizarra();
        System.out.println("Cuadrado");
        Figura a = new Cuadrado("Rojo");
        a.Color();
        a.dibujar();
        a.cambiarColor("Verde");
        a.borrar();
        b.AñadirFigura(a);
        System.out.println("------------------------------------");
        System.out.println("Triangulo");
        Figura c = new Triangulo("Amarillo");
        c.Color();
        c.dibujar();
        c.cambiarColor("Rojo");
        c.borrar();
        b.AñadirFigura(c);
        System.out.println("------------------------------------");
        System.out.println("Circulo");
        Figura d = new Circulo("Verde");
        d.Color();
        d.dibujar();
        d.cambiarColor("Azul");
        d.borrar();
        b.AñadirFigura(d);
         
    }

    
}
