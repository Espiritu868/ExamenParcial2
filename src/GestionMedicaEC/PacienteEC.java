
package GestionMedicaEC;

/**
 *
 * @author Ever Rolando Chavez Ramirez 202410050009
 */
public class PacienteEC {
    private Integer nroHistorialEC;
    private String enfermedadEC;

    public PacienteEC(Integer nroHistorialEC, String enfermedadEC) {
        this.nroHistorialEC = nroHistorialEC;
        this.enfermedadEC = enfermedadEC;
    }

    public Integer getNroHistorialEC() {
        return nroHistorialEC;
    }

    public void setNroHistorialEC(Integer nroHistorialEC) {
        this.nroHistorialEC = nroHistorialEC;
    }

    public String getEnfermedadEC() {
        return enfermedadEC;
    }

    public void setEnfermedadEC(String enfermedadEC) {
        this.enfermedadEC = enfermedadEC;
    }
    
    
}
