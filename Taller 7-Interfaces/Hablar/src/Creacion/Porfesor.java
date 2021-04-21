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
public class Porfesor extends Persona implements Hablador{
    
    private String Despacho;
    private String Email;

    public Porfesor(String Despacho, String Email, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.Despacho = Despacho;
        this.Email = Email;
    }

    /**
     * @return the Despacho
     */
    public String getDespacho() {
        return Despacho;
    }

    /**
     * @param Despacho the Despacho to set
     */
    public void setDespacho(String Despacho) {
        this.Despacho = Despacho;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public void Hablar() {
        System.out.println("Hola soy un Profesor y sé hablar");
        System.out.println("Nombre  : "+super.getNombre());
        System.out.println("Edad    : "+super.getEdad());
        System.out.println("Despacho: "+this.Despacho);
        System.out.println("Email   : "+this.Email);
    }
    
    
}
