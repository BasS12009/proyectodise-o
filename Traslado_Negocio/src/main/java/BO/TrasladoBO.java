/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Converters.TrasladoCVR;
import DAOs.TrasladoDAO;
import DTOs.TrasladoDTO;
import Excepciones.BOException;
import excepciones.DAOException;
import interfaces.ITrasladoBO;

/**
 *
 * @author diana
 */
public class TrasladoBO implements ITrasladoBO{
    
    // Data Access Object para manejar operaciones de base de datos relacionadas con 'Traslado'
    private final TrasladoDAO trasladoDAO;
    
    // Conversor para convertir objetos DTO a objetos de dominio y viceversa
    private final TrasladoCVR trasladoCVR;
    
    //Constructor
    public TrasladoBO() {
        // Inicialización de las dependencias DAO y CVR
        this.trasladoDAO = new TrasladoDAO();
        this.trasladoCVR = new TrasladoCVR();
    }

    @Override
    
    // Implementación del método agregar que pertenece a la interfaz que TrasladoBO implementa (suponiendo ITrasladoBO)
    public void agregar(TrasladoDTO traslado) throws BOException {
        try {
            // Convierte el objeto TrasladoDTO a un objeto de dominio utilizando el conversor (CVR)
            // y lo pasa al DAO para ser agregado a la base de datos
            trasladoDAO.agregar(trasladoCVR.convetir_Traslado(traslado));
            System.out.println("Traslado agregado correctamente.");
        } catch (DAOException e) {
            // Manejo de excepciones: Si ocurre un error en la operación DAO, se lanza una excepción BO con el mensaje de error original
            throw new BOException(e.getMessage(), e);
        }
    }
    
   
}
