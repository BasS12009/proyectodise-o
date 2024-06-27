/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Entidades.Traslado;
import excepciones.DAOException;


/**
 *
 * @author diana
 */
public interface ITrasladoDAO {
    
    public void agregar(Traslado traslado) throws DAOException;
    
    
}
