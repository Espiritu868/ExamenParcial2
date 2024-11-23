
package GestionMedicaEC;

/**
 *
 * @author Ever Rolando Chavez Ramirez 202410050009
 */
public class MedicoEC extends PersonaEC{
    
    private String especialidadEC;
    private Integer aniosExperienciaEC;

    public MedicoEC(String especialidadEC, Integer aniosExperienciaEC, String nombreEC, Integer edadEC, String direccionEC) {
        super(nombreEC, edadEC, direccionEC);
        this.especialidadEC = especialidadEC;
        this.aniosExperienciaEC = aniosExperienciaEC;
    }

    public String getEspecialidadEC() {
        return especialidadEC;
    }

    public void setEspecialidadEC(String especialidadEC) {
        this.especialidadEC = especialidadEC;
    }

    public Integer getAniosExperienciaEC() {
        return aniosExperienciaEC;
    }

    public void setAniosExperienciaEC(Integer aniosExperienciaEC) {
        this.aniosExperienciaEC = aniosExperienciaEC;
    }

    
    
    
    
    
    
}
