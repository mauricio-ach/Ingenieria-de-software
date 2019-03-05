/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import is.lab.mapita.modelo.Marcador;
import is.lab.mapita.modelo.MarcadorDAO;
import is.lab.mapita.modelo.Usuario;
import is.lab.mapita.modelo.UsuarioDAO;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author erick
 */
public class AgregaMarcador {
     private int idmarcador;
     private Usuario usuario;
     private String descripcion;
     private double longitud;
     private double latitud;

    public int getIdmarcador() {
        return idmarcador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public AgregaMarcador(int idmarcador, Usuario usuario, String descripcion, double longitud, double latitud) {
        Marcador m = new Marcador();
        this.idmarcador = idmarcador;
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.longitud = longitud;
        this.latitud = latitud;
    }               
}