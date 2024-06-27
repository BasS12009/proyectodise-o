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
     * @throws NegocioException si hay un problema con la solicitud del traslado.
     */
    public void solicitarTraslado(TrasladoDTO trasladoDTO) throws fachadaException;
    
    
}
