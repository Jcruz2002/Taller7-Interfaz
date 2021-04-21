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
public class Bedel extends Persona implements Hablador {

    private int Turno;
    private int Antiguedad;

    public Bedel(int Turno, int Antiguedad, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.Turno = Turno;
        this.Antiguedad = Antiguedad;
    }

    /**
     * @return the Turno
     */
    public int getTurno() {
        return Turno;
    }

    /**
     * @param Turno the Turno to set
     */
    public void setTurno(int Turno) {
        this.Turno = Turno;
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
        System.out.println("Hola soy un Bedel y sé hablar");
        System.out.println("Nombre     : "+super.getNombre());
        System.out.println("Edad       : "+super.getEdad());
        System.out.println("Turno      : "+this.Turno);
        System.out.println("Antiguedad : "+this.Antiguedad);
    }
    
    
    
}
