
package GestionMedicaEC;

/**
 *
 * @author Ever Rolando Chavez Ramirez 202410050009
 */
public class PersonaEC {
    
    private String nombreEC;
    private Integer edadEC; 
    private String direccionEC;

    public PersonaEC(String nombreEC, Integer edadEC, String direccionEC) {
        this.nombreEC = nombreEC;
        this.edadEC = edadEC;
        this.direccionEC = direccionEC;
    }

    public String getNombreEC() {
        return nombreEC;
    }

    public void setNombreEC(String nombreEC) {
        this.nombreEC = nombreEC;
    }

    public Integer getEdadEC() {
        return edadEC;
    }

    public void setEdadEC(Integer edadEC) {
        this.edadEC = edadEC;
    }

    public String getDireccionEC() {
        return direccionEC;
    }

    public void setDireccionEC(String direccionEC) {
        this.direccionEC = direccionEC;
    }
    
    
    
}
