/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.lab.mapita.controlador;

import is.lab.mapita.modelo.Marcador;
import is.lab.mapita.modelo.MarcadorDAO;
import java.util.List;

/**
 *
 * @author mauricio07
 */
public class ConsultarMarcador {
    public List<Marcador> consultarMarcador(){
        MarcadorDAO mdb = new MarcadorDAO();
        return mdb.findAll();
    }
}
