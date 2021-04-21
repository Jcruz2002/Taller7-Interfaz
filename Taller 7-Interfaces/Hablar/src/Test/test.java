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
public class test {
    
    public static void main(String[] args) {
        
        Hablador habladores[] = new Hablador[7];
        
        Hablador jesus = new Alumno("Ing.Sistemas", "02","Jesus",19);
        habladores[0]=jesus;
        
        Hablador Guillermo = new Porfesor("UPC","guillermo@gmail.com","Guillermo",40);
        habladores[1]=Guillermo;
        
        Hablador Juan = new Bedel(5,10,"Juan",37);
        habladores[2]=Juan;
        
        Hablador LG = new TV("SI",0,100,2000000);
        habladores[3]=LG;
        
        Hablador rad = new Radio("NO",100,40,400000);
        habladores[4]=rad;
        
        Hablador loro = new Loro("Amazonas","Verde","Masculino",9);
        habladores[5]=loro;
        
        Hablador piolin = new Piolin(6,"Femenino",4,"PIO PIO");
        habladores[6]=piolin;
        
        MostrarHabladores(habladores);
    }
    
    public static void MostrarHabladores(Hablador habladores[]){
        for(Hablador p: habladores){
            System.out.println("-------------------------------");
            p.Hablar();
        }
    }
    
}
