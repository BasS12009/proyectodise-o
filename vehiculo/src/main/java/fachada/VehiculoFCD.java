/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import control.VehiculoCTL;
import excepciones.ControlException;
import excepciones.FachadaException;
import interfaz.IVehiculoFCD;
import javax.swing.JComboBox;

/**
 * Clase VehiculoFCD que implementa la interfaz IVehiculoFCD.
 * Actúa como una fachada para manejar operaciones relacionadas con vehículos.
 * 
 * Autor: skevi
 */
public class VehiculoFCD implements IVehiculoFCD {
    
    private VehiculoCTL vehiculo;

    /**
     * Constructor de VehiculoFCD que inicializa la instancia de VehiculoCTL.
     */
    public VehiculoFCD() {
        this.vehiculo = new VehiculoCTL();
    }

    /**
     * Método que llena un JComboBox con datos de vehículos.
     * 
     * @param comboBox El JComboBox donde se llenarán los datos.
     * @throws FachadaException Si ocurre un error específico de fachada al llenar el JComboBox.
     */
    @Override
    public void llenarCBX(JComboBox comboBox) throws FachadaException {
        try {
            vehiculo.llenarCBX(comboBox); // Llama al método correspondiente de VehiculoCTL
        } catch (ControlException ex) {
            throw new FachadaException(ex.getMessage()); // Captura y relanza como FachadaException
        }
    }
}

