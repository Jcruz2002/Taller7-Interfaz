
package Creacion;

public class Profesor implements Trabajador {
    
    private int hora;
    
    public Profesor(int hora){
        this.hora=hora;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public double calcularSueldo() {
        
        return (this.hora*120)+ calcularbonificacion();
    }

    @Override
    public double calcularbonificacion() {
        return ((this.hora*120)*0.70);
    }
    
    
}
