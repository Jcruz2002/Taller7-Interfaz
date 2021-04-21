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
public class Pizarra {
    
    private int n,NMAXF = 3;
    private Figura[] figuras;
    
    public Pizarra(){
        this.figuras = new Figura[this.NMAXF];
        this.n=0;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * @return the NMAXF
     */
    public int getNMAXF() {
        return NMAXF;
    }

    /**
     * @param NMAXF the NMAXF to set
     */
    public void setNMAXF(int NMAXF) {
        this.NMAXF = NMAXF;
    }

    /**
     * @return the figuras
     */
    public Figura[] getFiguras() {
        return figuras;
    }

    /**
     * @param figuras the figuras to set
     */
    public void setFiguras(Figura[] figuras) {
        this.figuras = figuras;
    }
    
     public boolean AñadirFigura(Figura e){
        if(this.n<this.getNMAXF()){
            this.figuras[this.n]=e;
            this.n++;
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
