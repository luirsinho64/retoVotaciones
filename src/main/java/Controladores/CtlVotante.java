package Controladores;

import Clases.ClsVotante;
import Clases.ClsMensaje;
import Modelos.MdlVotante;
import java.util.LinkedList;
/**
 *
 * @author Luirhsiño Sanchez Surincho
 */
public class CtlVotante {
    MdlVotante modelo;

    public CtlVotante() {

        this.modelo = new MdlVotante();
    }

    public ClsMensaje AgregarVotante(ClsVotante votante) {

        ClsMensaje respuesta = this.modelo.agregarVotante(votante);
        return respuesta;
    }

    public ClsMensaje ActualizarVotante(ClsVotante votante) {

        ClsMensaje respuesta = this.modelo.ActualizarVotante(votante);
        return respuesta;
    }

    public ClsMensaje EliminarVotante(String votante) {
        ClsMensaje respuesta = this.modelo.EliminarVotante(votante);
        return respuesta;
    }

    public LinkedList<ClsVotante> ObtenerVotantes() {

        return this.modelo.ObtenerVotantes();

    }
}
