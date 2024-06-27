/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fachada;

import Control.TrasladoCTL;
import DTOs.TrasladoDTO;
import excepciones.fachadaException;

/**
 *
 * @author diana
 */
public class TrasladoFCD {
      private final TrasladoCTL traslado;

    public TrasladoFCD() {
        this.traslado = new TrasladoCTL();
        
    }

    public void solicitarTraslado(TrasladoDTO trasladoDTO) throws fachadaException {
        if (traslado.validarTrasladoDTO(trasladoDTO)) {
            traslado.solicitarTraslado(trasladoDTO);
        }
       
    }
}

