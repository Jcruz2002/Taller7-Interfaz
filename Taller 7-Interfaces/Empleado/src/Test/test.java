
package Test;

import Creacion.*;

public class test {
    
    public static void main(String[] args) {
        
        
        Trabajador trabajadores[] = new Trabajador[3];
        
        Trabajador jesus = new Empleado("Coordinador");
        trabajadores[0]=jesus;
        Trabajador andres = new Empleado("Asistente");
        trabajadores[1]=andres;
        Trabajador juan = new Profesor(30);
        trabajadores[2]=juan;
    
        
        MostrarCantantes(trabajadores);
    }
     public static void MostrarCantantes(Trabajador trabajador[]){
        for(Trabajador p: trabajador){
            System.out.println("Bonificacion : " + p.calcularbonificacion());
            System.out.println("Salario      : " + p.calcularSueldo());
            System.out.println("----------------------------------------");
        }
    }
}
