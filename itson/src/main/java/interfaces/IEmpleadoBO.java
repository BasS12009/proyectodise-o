/**
 * IEmpleadoBO.java
 * 
 * Interfaz IEmpleadoBO que declara los métodos necesarios para las 
 * operaciones de la capa negocio, relacionadas con empleados.
 */
package interfaces;

import excepciones.NegocioException;
import dtos.EmpleadoDTO;
import java.util.List;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public interface IEmpleadoBO {
    
    
    /**
     * Busca un empleado por su ID.
     * 
     * @param id El ID del empleado a buscar.
     * @return El DTO del empleado encontrado.
     * @throws NegocioException Si ocurre un error de negocio durante la búsqueda.
     */
    public EmpleadoDTO buscarEmpleado(int id) throws NegocioException;
    
    /**
     * Obtiene una lista paginada de empleados.
     * 
     * @param offset El inicio de la paginación.
     * @param limit El número de empleados a devolver.
     * @return Una lista de DTOs de empleados.
     * @throws NegocioException Si ocurre un error de negocio durante la obtención de la lista.
     */
    public List<EmpleadoDTO> ListaEmpleados(int offset, int limit) throws NegocioException;
    
    /**
     * Verifica la existencia de un administrador.
     * 
     * @param empleadoDTO El DTO del administrador a verificar.
     * @return true si el administrador existe, false en caso contrario.
     * @throws NegocioException Si ocurre un error de negocio durante la verificación.
     */
    public boolean existenciaAdmin(EmpleadoDTO empleadoDTO) throws NegocioException;
}
