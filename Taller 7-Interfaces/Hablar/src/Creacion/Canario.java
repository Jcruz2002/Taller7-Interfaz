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
public class Canario extends Ave {

    private String Canta;

    public Canario(String Sexo, int Edad,String Canta) {
        super(Sexo, Edad);
        this.Canta=Canta;
    }

    /**
     * @return the Canta
     */
    public String getCanta() {
        return Canta;
    }

    /**
     * @param Canta the Canta to set
     */
    public void setCanta(String Canta) {
        this.Canta = Canta;
    }
    
     
    
    
}
