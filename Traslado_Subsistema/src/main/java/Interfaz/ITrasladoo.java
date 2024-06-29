/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import DTOs.TrasladoDTO;
import excepciones.fachadaException;

/**
 *
 * @author diana
 */
public interface ITrasladoo {
     
     /**
     * Solicita un traslado de vehículo.
     *
     * @param trasladoDTO los detalles del traslado solicitados.
     * @throws excepciones.fachadaException
     */
    public void solicitarTraslado(TrasladoDTO trasladoDTO) throws fachadaException;
    
    
}
