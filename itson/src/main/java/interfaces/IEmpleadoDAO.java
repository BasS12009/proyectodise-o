/**
 * IEmpleadoDAO.java
 * 
 * Interfaz IEmpleadoDAO que declara los métodos necesarios para las operaciones
 * de acceso a datos relacionadas con empleados.
 */
package interfaces;

import excepciones.PersistenciaException;
import entidad.Empleado;
import java.util.List;


/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public interface IEmpleadoDAO {
    
    
    /**
     * Busca un empleado por su ID.
     * 
     * @param id El ID del empleado a buscar.
     * @return El empleado encontrado.
     * @throws PersistenciaException Si ocurre un error de persistencia durante la búsqueda.
     */
    public Empleado buscarEmpleado(int id) throws PersistenciaException;
    
    /**
     * Obtiene una lista paginada de empleados.
     * 
     * @param offset El inicio de la paginación.
     * @param limit El número de empleados a devolver.
     * @return Una lista de empleados.
     * @throws PersistenciaException Si ocurre un error de persistencia durante la obtención de la lista.
     */
    public List<Empleado> ListaEmpleados(int offset, int limit) throws PersistenciaException;
    
    /**
     * Verifica la existencia de un administrador.
     * 
     * @param empleado El administrador a verificar.
     * @return true si el administrador existe, false en caso contrario.
     * @throws PersistenciaException Si ocurre un error de persistencia durante la verificación.
     */
    public boolean existenciaAdmin(Empleado empleado) throws PersistenciaException;
}