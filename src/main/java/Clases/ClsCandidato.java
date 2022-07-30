package Clases;

/**
 *
 * @author Luirhsiño Sanchez Surincho
 */
public class ClsCandidato extends ClsPersona {
    private String partidoPolitico;
    private String ciudadorigen;
    private String descripcion;
    private String mensajeCampanha;
    private String propuestas;

    public ClsCandidato(String partidoPolitico, String ciudadorigen, String descripcion, String mensajeCampanha, String propuestas, String numeroDocumento, String nombre, String telefono) {
        super(numeroDocumento, nombre, telefono);
        this.partidoPolitico = partidoPolitico;
        this.ciudadorigen = ciudadorigen;
        this.descripcion = descripcion;
        this.mensajeCampanha = mensajeCampanha;
        this.propuestas = propuestas;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getCiudadorigen() {
        return ciudadorigen;
    }

    public void setCiudadorigen(String ciudadorigen) {
        this.ciudadorigen = ciudadorigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMensajeCampanha() {
        return mensajeCampanha;
    }

    public void setMensajeCampanha(String mensajeCampanha) {
        this.mensajeCampanha = mensajeCampanha;
    }

    public String getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(String propuestas) {
        this.propuestas = propuestas;
    }
        
}
