/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

//import Converters.VehiculoCVR;
import Converters.VehiculoCVR;
import DAOs.VehiculoDAO;
import DTOs.VehiculoDTO;
import Entidades.Vehiculo;
import Excepciones.BOException;
import excepciones.DAOException;
import interfaces.IVehiculoBO;
import interfaces.IVehiculoDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diana
 */
public class VehiculoBO implements IVehiculoBO {

    private final IVehiculoDAO vehiculoDAO;
    private final VehiculoCVR vehiculoCVR;

    public VehiculoBO() {
        this.vehiculoDAO = new VehiculoDAO();
        this.vehiculoCVR = new VehiculoCVR();
    }

    @Override
    public List<VehiculoDTO> listaVehiculos() throws BOException {
        List<VehiculoDTO> listaDTO = new ArrayList<>();
        try {
            List<Vehiculo> lista = vehiculoDAO.obtenerTodos(); // Cambiado a obtenerTodos()
            for (Vehiculo vehiculo : lista) { // Utilizado un bucle for-each para mayor claridad
                listaDTO.add(vehiculoCVR.convertir_DTO(vehiculo));
            }
            return listaDTO;
        } catch (DAOException e) {
            throw new BOException("Error al obtener la lista de vehículos: " + e.getMessage(), e);
        }
    }
}
