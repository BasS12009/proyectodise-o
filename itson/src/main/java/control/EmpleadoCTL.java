/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dtos.EmpleadoDTO;
import excepciones.ControlException;
import excepciones.NegocioException;
import interfaces.IEmpleadoBO;
import interfaces.IEmpleadoCTL;
import java.util.List;
import negocio.EmpleadoBO;

/**
 * Clase EmpleadoCTL que implementa la interfaz IEmpleadoCTL.
 * Actúa como un controlador que maneja la lógica de negocio para empleados.
 * 
 * @author skevi
 */
public class EmpleadoCTL implements IEmpleadoCTL {

    // Referencia a la lógica de negocio de empleados
    IEmpleadoBO empleadoBO;

    /**
     * Constructor de la clase EmpleadoCTL.
     * Inicializa la referencia a la lógica de negocio de empleados.
     */
    public EmpleadoCTL() {
        this.empleadoBO = new EmpleadoBO();
    }
    
    /**
     * Busca un empleado por su ID.
     * 
     * @param id El ID del empleado a buscar.
     * @return EmpleadoDTO El empleado encontrado.
     * @throws ControlException Si ocurre un error en la capa de control.
     */
    @Override
    public EmpleadoDTO buscarEmpleado(int id) throws ControlException {
        try {
            return empleadoBO.buscarEmpleado(id);
        } catch (NegocioException ex) {
            throw new ControlException(ex.getMessage());
        }
    }

    /**
     * Obtiene una lista de empleados con paginación.
     * 
     * @param offset El índice inicial de la lista.
     * @param limit El número máximo de empleados a devolver.
     * @return List<EmpleadoDTO> Lista de empleados.
     * @throws ControlException Si ocurre un error en la capa de control.
     */
    @Override
    public List<EmpleadoDTO> ListaEmpleados(int offset, int limit) throws ControlException {
        try {
            return empleadoBO.ListaEmpleados(offset, limit);
        } catch (NegocioException ex) {
            throw new ControlException(ex.getMessage());
        }
    }

    /**
     * Verifica la existencia de un administrador.
     * 
     * @param empleadoDTO El objeto EmpleadoDTO a verificar.
     * @return boolean true si el administrador existe, false en caso contrario.
     * @throws ControlException Si ocurre un error en la capa de control.
     */
    @Override
    public boolean existenciaAdmin(EmpleadoDTO empleadoDTO) throws ControlException {
        try {
            return empleadoBO.existenciaAdmin(empleadoDTO);
        } catch (NegocioException ex) {
            throw new ControlException(ex.getMessage());
        }
    }
}

