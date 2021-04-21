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
public class Loro extends Ave implements Hablador{
    
    private String Region;
    private String Color;

    public Loro(String Region, String Color, String Sexo, int Edad) {
        super(Sexo, Edad);
        this.Region = Region;
        this.Color = Color;
    }

    /**
     * @return the Region
     */
    public String getRegion() {
        return Region;
    }

    /**
     * @param Region the Region to set
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public void Hablar() {
        System.out.println("Hola soy un Loro y sé hablar");
        System.out.println("Sexo    : "+super.getSexo());
        System.out.println("Edad    : "+super.getEdad());
        System.out.println("Region  : "+this.Region);
        System.out.println("Color   : "+this.Color);
    }
    
    
    
}
