package Clases;

/**
 *
 * @author Luirhsiño Sanchez Surincho
 */
public class ClsPersona {
    private String numeroDocumento;
    private String nombre;
    private String telefono;

    public ClsPersona(String numeroDocumento, String nombre, String telefono) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
        
}
