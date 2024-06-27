/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Converters;

import DTOs.TrasladoDTO;
import DTOs.VehiculoDTO;
import Entidades.Traslado;
import Entidades.Vehiculo;
import java.time.LocalDateTime;

/**
 *
 * @author diana
 */
public class TrasladoCVR {

    public Traslado convetir_Traslado(TrasladoDTO trasladoDTO) {

        String folio = trasladoDTO.getFolio();
        String motivo = trasladoDTO.getMotivo();
        int personas = trasladoDTO.getPersonas();
        LocalDateTime fechaHoraSalida = trasladoDTO.getFechaHoraSalida();
        LocalDateTime fechaHoraRegreso = trasladoDTO.getFechaHoraRegreso();
        boolean disponibilidad = trasladoDTO.isDisponibilidad();
        String carroceria = trasladoDTO.getCarroceria();
        String llantas = trasladoDTO.getLlantas();
        int combustible = trasladoDTO.getCombustible();
        String estadoVehiculo = trasladoDTO.getEstadoVehiculo();
        Vehiculo vehiculo = null;
        return new Traslado(folio, motivo, personas, fechaHoraSalida, fechaHoraRegreso, disponibilidad, vehiculo, estadoVehiculo, llantas, carroceria, combustible);

    }

    public TrasladoDTO convertir_DTO(Traslado traslado) {

        String folio = traslado.getFolio();
        String motivo = traslado.getMotivo();
        int personas = traslado.getPersonas();
        LocalDateTime fechaHoraSalida = traslado.getFechaHoraSalida();
        LocalDateTime fechaHoraRegreso = traslado.getFechaHoraRegreso();
        boolean disponibilidad = traslado.isDisponibilidad();
        VehiculoDTO vehiculoDTO = null;
        String carroceria = traslado.getCarroceria();
        String llantas = traslado.getLlantas();
        int combustible = traslado.getCombustible();
        String estadoVehiculo = traslado.getEstadoVehiculo();
        return new TrasladoDTO(folio, motivo, personas, fechaHoraSalida, fechaHoraRegreso, disponibilidad, vehiculoDTO, estadoVehiculo, llantas, carroceria, combustible);
    }

}
