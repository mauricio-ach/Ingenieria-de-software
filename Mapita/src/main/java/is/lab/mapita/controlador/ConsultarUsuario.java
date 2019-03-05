/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import is.lab.mapita.modelo.Usuario;
import is.lab.mapita.modelo.UsuarioDAO;
import java.util.List;

/**
 *
 * @author mauricio07
 */
public class ConsultarUsuario {    
    
    public List<Usuario> consultarUsuario() {
        UsuarioDAO udb = new UsuarioDAO();               
        return udb.findAll();
    }
}
