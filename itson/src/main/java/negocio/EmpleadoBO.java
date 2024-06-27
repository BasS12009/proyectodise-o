/**
 * EmpleadoBO.java
 * 
 * Clase que implementa la lógica de negocio para gestionar empleados;
 * Proporciona métodos para registrar, buscar y listar empleados, 
 * así como verificar la existencia de administradores.
 */
package negocio;



import convertidor.EmpleadoCVR;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import dao.EmpleadoDAO;
import dtos.EmpleadoDTO;
import entidad.Empleado;
import interfaces.IEmpleadoBO;
import interfaces.IEmpleadoDAO;
import java.util.ArrayList;
import java.util.List;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class EmpleadoBO implements IEmpleadoBO{
    
    IEmpleadoDAO empleadoDAO;
    EmpleadoCVR empleadoCVR;

    /**
     * Constructor por omisión que inicializa las dependencias de DAO y Convertidor.
     */
    public EmpleadoBO() {
        this.empleadoDAO = new EmpleadoDAO();
        this.empleadoCVR = new EmpleadoCVR();        
    }

    /**
     * Obtiene una lista paginada de empleados por medio de los parámetros offset
     * y limit.
     * 
     * @param offset El desplazamiento inicial de la lista.
     * @param limit La cantidad máxima de empleados a regresar.
     * @return Una lista de objetos EmpleadoDTO.
     * @throws NegocioException Si ocurre un error durante la obtención de los empleados.
     */
    @Override
    public List<EmpleadoDTO> ListaEmpleados(int offset, int limit) throws NegocioException {
        List<EmpleadoDTO> listaPaginada = new ArrayList<>();
       
        try {
            List<Empleado> lista = this.empleadoDAO.ListaEmpleados(offset, limit);
            
            for (Empleado empleado : lista) {
                listaPaginada.add(this.empleadoCVR.convertir_DTO(empleado));
            }
            
            return listaPaginada;
        
        } catch (PersistenciaException e) {
            throw new NegocioException(e.getMessage());
        }
    }

    /**
     * Busca un empleado por su ID, recibiéndo como parámetro el ID por medio de
     * un valor entero;
     * 
     * Al momento de recibir el ID del empleado, manda a llamar al método de la
     * clase EmpleadoCVR para poder convertirlo en un objeto transferible,
     * para posteriormente buscarlo por un método de la clase EmpleadoDAO llamado
     * buscarEmpleado que recibe como parámetro el ID del empleado y lo regresa;
     * 
     * En caso de que no pueda regresar al empleado por cualquier tipo de error,
     * se manda a llamar a la excepción de Negocio para mandar un mensaje que
     * no se pudo buscar al empleado.
     * 
     * 
     * @param id El ID del empleado a buscar.
     * @return El objeto EmpleadoDTO correspondiente al empleado encontrado.
     * @throws NegocioException Si ocurre un error durante la búsqueda del empleado.
     */
    @Override
    public EmpleadoDTO buscarEmpleado(int id) throws NegocioException {
        try {
            return this.empleadoCVR.convertir_DTO(this.empleadoDAO.buscarEmpleado(id));
        } catch (PersistenciaException e) {
            throw new NegocioException(e.getMessage());
        }    
    }

    /**
     * 
     * Verifica la existencia de un administrador, recibiéndo como parámetro un
     * objeto EmpleadoDTO por medio del objeto empleadoDTO;
     * 
     * Al momento de recibir el objeto empleadoDTO, manda a llamar al método de la
     * clase EmpleadoDAO, para posteriormente convertirlo (después de hallarlo),
     * por un método de la clase EmpleadoCVR llamado
     * convertir_Entidad que recibe como parámetro el objeto empleadoDTO y lo 
     * regresa;
     * 
     * En caso de que no pueda regresar al empleado por cualquier tipo de error,
     * se manda a llamar a la excepción de Negocio para mandar un mensaje que
     * no se pudo buscar al empleado. 
     * 
     * @param empleadoDTO El objeto EmpleadoDTO que contiene los datos del administrador a verificar.
     * @return {@code true} si el administrador existe, {@code false} en caso contrario.
     * @throws NegocioException Si ocurre un error durante la verificación de la existencia del administrador.
     * 
     */
    @Override
    public boolean existenciaAdmin(EmpleadoDTO empleadoDTO) throws NegocioException {
        try {
            String correo = empleadoDTO.getCorreo();
            String contraseña = empleadoDTO.getContraseña();
            Empleado empleado = new Empleado(correo, contraseña);
            return this.empleadoDAO.existenciaAdmin(empleado);
           
        } catch (PersistenciaException e) {
            throw new NegocioException(e.getMessage());
        }
    }
}