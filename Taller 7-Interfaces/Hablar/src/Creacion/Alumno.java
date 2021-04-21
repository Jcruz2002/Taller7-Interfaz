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
public class Alumno extends Persona implements Hablador{
    
    private String Carrera;
    private String Curso;

    public Alumno(String Carrera, String Curso, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.Carrera = Carrera;
        this.Curso = Curso;
    }

    /**
     * @return the Carrera
     */
    public String getCarrera() {
        return Carrera;
    }

    /**
     * @param Carrera the Carrera to set
     */
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    /**
     * @return the Curso
     */
    public String getCurso() {
        return Curso;
    }

    /**
     * @param Curso the Curso to set
     */
    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    @Override
    public void Hablar() {
        System.out.println("Hola soy un Alumno y sé hablar");
        System.out.println("Nombre : "+super.getNombre());
        System.out.println("Edad   : "+super.getEdad());
        System.out.println("Carrera: "+this.Carrera);
        System.out.println("Curso  : "+this.Curso);
        
    }
    
    
}
