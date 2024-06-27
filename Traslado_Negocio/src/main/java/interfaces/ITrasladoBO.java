/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import DTOs.TrasladoDTO;
import Excepciones.BOException;

/**
 *
 * @author diana
 */
public interface ITrasladoBO {

     // Método que se implementa para agregar un nuevo traslado
    // Recibe un objeto TrasladoDTO como parámetro y puede lanzar una excepción
    public void agregar(TrasladoDTO traslado) throws BOException;
}
