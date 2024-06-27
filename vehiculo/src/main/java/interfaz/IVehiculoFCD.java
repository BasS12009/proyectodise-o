/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import excepciones.FachadaException;
import javax.swing.JComboBox;

/**
 * Interfaz IVehiculoFCD que define el contrato para las fachadas de vehículos.
 * 
 * Autor: skevi
 */
public interface IVehiculoFCD {
    
    /**
     * Método para llenar un JComboBox con datos de vehículos.
     * 
     * @param comboBox El JComboBox donde se llenarán los datos.
     * @throws FachadaException Si ocurre un error específico de fachada al llenar el JComboBox.
     */
    public void llenarCBX(JComboBox comboBox) throws FachadaException;
    
}

