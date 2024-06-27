/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTOs.VehiculoDTO;
import Excepciones.BOException;
import java.util.List;

/**
 *
 * @author diana
 */
public interface IVehiculoBO {
    
     // Método que se implementa para obtener una lista de vehículos
    // Este método devuelve una lista de objetos VehiculoDTO y puede lanzar una excepción 
    public List<VehiculoDTO> listaVehiculos() throws BOException;
}
