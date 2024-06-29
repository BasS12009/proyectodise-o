/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import BO.TrasladoBO;
import DTOs.TrasladoDTO;
import excepciones.fachadaException;
import interfaces.ITrasladoBO;



/**
 *
 * @author diana
 */
public class TrasladoCTL { 

    private final ITrasladoBO traslado;

    public TrasladoCTL() {
       this.traslado = new TrasladoBO();
    }

    public void solicitarTraslado(TrasladoDTO trasladoDTO) throws fachadaException {
      try {
            traslado.agregar(trasladoDTO);
        } catch (Exception e) {
            // Manejar cualquier excepción que pueda ocurrir y envolverla en una FachadaException
            throw new fachadaException("Error al solicitar el traslado: " + e.getMessage(), e);
        }
}

    public boolean validarTrasladoDTO(TrasladoDTO trasladoDTO) throws fachadaException {
    if (trasladoDTO.getMotivo() == null || trasladoDTO.getMotivo().isEmpty()) {
        throw new fachadaException("El motivo del traslado no puede estar vacío.");
    }

    if (trasladoDTO.getPersonas() <= 0) {
        throw new fachadaException("El número de personas debe ser mutiplo de 5.");
    }

    if (trasladoDTO.getFechaHoraSalida() == null) {
        throw new fachadaException("La fecha y hora de salida no pueden ser nulas.");
    }

    if (trasladoDTO.getFechaHoraRegreso() == null) {
        throw new fachadaException("La fecha y hora de regreso no pueden ser nulas.");
    }

    if (trasladoDTO.getFechaHoraSalida().after(trasladoDTO.getFechaHoraRegreso())) {
        throw new fachadaException("La fecha y hora de salida debe ser anterior a la fecha y hora de regreso.");
    }
    
    return true;
}


}