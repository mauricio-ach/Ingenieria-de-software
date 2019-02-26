/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.mapita.controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import lab.mapita.Modelo.Usuario;
import lab.mapita.Modelo.UsuarioDAO;

/**
 *
 * @author mauricio07
 */
@ManagedBean
@SessionScoped
//@RequestScoped
public class BuscaPorNombre {
    private String nombre;
    
    private List<Usuario> resultado;

    public List<Usuario> getResultado() {
        return resultado;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String buscaPorNombre(){
        if(nombre.equals(""))
            return "";
        UsuarioDAO ubd = new UsuarioDAO();
        resultado =  ubd.buscaPorNombre(nombre);
        return "resultado?faces-redirect=true";
    }
}
