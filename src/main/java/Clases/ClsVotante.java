package Clases;

/**
 *
 * @author Luirhsiño Sanchez Surincho
 */
public class ClsVotante extends ClsPersona {
    private String correo;

    public ClsVotante(String correo, String numeroDocumento, String nombre, String telefono) {
        super(numeroDocumento, nombre, telefono);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
        
}
