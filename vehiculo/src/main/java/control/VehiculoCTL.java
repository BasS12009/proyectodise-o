/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dtos.VehiculoDTO;
import bo.VehiculoBO;
import excepciones.ControlException;
import exceptions.BisnessException;
import interfaces.IVehiculoBO;
import javax.swing.JComboBox;

/**
 *
 * @author skevi
 */
public class VehiculoCTL {
    
    IVehiculoBO vehiculo;

    /**
     * Crea una nueva instancia de VehiculoCTL.
     */
    public VehiculoCTL() {
        this.vehiculo = new VehiculoBO();
    }
    
    /**
     * Llena un JComboBox con los vehículos disponibles.
     * 
     * @param comboBox El JComboBox que se desea llenar con los vehículos.
     * @throws ControlException Si ocurre un error relacionado con la obtención de datos de los vehículos.
     */
    public void llenarCBX(JComboBox comboBox) throws ControlException {
        try {
            // Obtener la lista de vehículos a través del controlador
            for (VehiculoDTO vehiculoDTO : vehiculo.listaVehiculos()) {
                comboBox.addItem(vehiculoDTO);
            }
        } catch (BisnessException ex) {
            // Lanzar una PropsException si ocurre un error al obtener los datos de los vehículos
            throw new ControlException("Error al cargar los datos de los vehiculos");
        }
    }
    
}
