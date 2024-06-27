/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Entidades.Vehiculo;
import excepciones.DAOException;
import java.util.List;

/**
 *
 * @author diana
 */
public interface IVehiculoDAO {

    public void agregar(Vehiculo vehiculo) throws DAOException;
    
    public List<Vehiculo> obtenerTodos() throws DAOException;
    
   
}
