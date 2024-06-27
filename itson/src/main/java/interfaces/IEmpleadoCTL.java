/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import excepciones.ControlException;
import dtos.EmpleadoDTO;
import java.util.List;

/**
 *
 * @author skevi
 */
public interface IEmpleadoCTL {
    
    /**
     * Busca un empleado por su ID.
     * 
     * @param id El ID del empleado a buscar.
     * @return El DTO del empleado encontrado.
     * @throws ControlException Si ocurre un error de negocio durante la búsqueda.
     */
    public EmpleadoDTO buscarEmpleado(int id) throws ControlException;
    
    /**
     * Obtiene una lista paginada de empleados.
     * 
     * @param offset El inicio de la paginación.
     * @param limit El número de empleados a devolver.
     * @return Una lista de DTOs de empleados.
     * @throws ControlException Si ocurre un error de negocio durante la obtención de la lista.
     */
    public List<EmpleadoDTO> ListaEmpleados(int offset, int limit) throws ControlException;
    
    /**
     * Verifica la existencia de un administrador.
     * 
     * @param empleadoDTO El DTO del administrador a verificar.
     * @return true si el administrador existe, false en caso contrario.
     * @throws ControlException Si ocurre un error de negocio durante la verificación.
     */
    public boolean existenciaAdmin(EmpleadoDTO empleadoDTO) throws ControlException;
    
}
