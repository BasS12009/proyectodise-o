/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Converters;

import DTOs.VehiculoDTO;
import Entidades.Vehiculo;

/**
 *
 * @author diana
 */
public class VehiculoCVR {
    
 // Método para convertir un VehiculoDTO a un objeto de dominio Vehiculo
    public Vehiculo convertir_Entidad(VehiculoDTO vehiculoDTO) {
        // Extrae los atributos del objeto VehiculoDTO
        int numVehiculo = vehiculoDTO.getNumVehiculo();
        String marca = vehiculoDTO.getMarca();
        String modelo = vehiculoDTO.getModelo();
        int año = vehiculoDTO.getAño();
        String tipo = vehiculoDTO.getTipo();
        String placa = vehiculoDTO.getPlaca();
        String capacidad = vehiculoDTO.getCapacidad();

         // Crea y retorna un nuevo objeto Vehiculo utilizando los atributos extraídos
        return new Vehiculo( numVehiculo, marca, modelo, año, tipo, placa, capacidad);
    }

    // Método para convertir un objeto de dominio Vehiculo a un VehiculoDTO
    public VehiculoDTO convertir_DTO(Vehiculo vehiculo) {
      
         // Extrae los atributos del objeto Vehiculo
        int numVehiculo = vehiculo.getNumVehiculo();
        String marca = vehiculo.getMarca();
        String modelo = vehiculo.getModelo();
        int año = vehiculo.getAño();
        String tipo = vehiculo.getTipo();
        String placa = vehiculo.getPlaca();
        String capacidad = vehiculo.getCapacidad();

        // Crea y retorna un nuevo objeto VehiculoDTO utilizando los atributos extraídos
        return new VehiculoDTO( numVehiculo, marca, modelo, año, tipo, placa, capacidad); // No se incluye el id en el constructor del DTO
    }
}
