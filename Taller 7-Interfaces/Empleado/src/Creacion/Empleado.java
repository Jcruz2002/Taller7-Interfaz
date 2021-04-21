
package Creacion;

public class Empleado implements Trabajador {
    
    private String cargo;
    
    public Empleado(String cargo){
        this.cargo = cargo;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
     @Override
    public double calcularbonificacion() {
           if(this.cargo.equals("Coordinador")){
            return 5000;
        }
        else
        {
            if(this.cargo.equals("Asistente")){
                return 4000;
            }
            else
            {
                return 3000;
            }
        }        
    }
    
    @Override
    public double calcularSueldo() {
        
        if(this.cargo.equals("Coordinador")){
            return 5000 + calcularbonificacion();
        }
        else
        {
            if(this.cargo.equals("Asistente")){
                return 4000 + calcularbonificacion();
            }
            else
            {
                return 3000 + calcularbonificacion();
            }
        }
        
    }
       
    
    }
