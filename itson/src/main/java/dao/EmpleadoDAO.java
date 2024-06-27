/**
 * EmpleadoDAO.java
 * 
 * Implementación de la interfaz IEmpleadoDAO para el acceso y 
 * manipulación de datos de empleados; Gestiona listas de empleados, 
 * administradores y choferes, y proporciona métodos para registrar, 
 * buscar y listar empleados.
 * 
 */
package dao;

import excepciones.PersistenciaException;
import conexion.ConexionBD;
import entidad.Empleado;
import interfaces.IConexionBD;
import java.util.List;
import interfaces.IEmpleadoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 * Clase EmpleadoDAO que implementa la interfaz IEmpleadoDAO.
 * Proporciona métodos para interactuar con la base de datos de empleados.
 * 
 * Autores:
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class EmpleadoDAO implements IEmpleadoDAO {

    // Referencia a la conexión con la base de datos
    IConexionBD conexion;

    /**
     * Constructor de la clase EmpleadoDAO.
     * Inicializa la referencia a la conexión con la base de datos.
     */
    public EmpleadoDAO() {
        this.conexion = new ConexionBD();
    }
    
    /**
     * Obtiene una lista de empleados con paginación.
     * 
     * @param offset El índice inicial de la lista.
     * @param limit El número máximo de empleados a devolver.
     * @return List<Empleado> Lista de empleados.
     * @throws PersistenciaException Si ocurre un error al obtener la lista de empleados.
     */
    @Override
    public List<Empleado> ListaEmpleados(int offset, int limit) throws PersistenciaException {
        List<Empleado> empleados = new ArrayList<>();
        String query = "SELECT * FROM Empleados LIMIT ? OFFSET ?";

        try (Connection conn = conexion.crearConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, limit);
            stmt.setInt(2, offset);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Empleado empleado = new Empleado(
                    rs.getInt("id"),
                    rs.getString("correo"),
                    rs.getString("contrasena"),
                    rs.getString("tipo")
                );
                empleados.add(empleado);
            }

        } catch (SQLException e) {
            throw new PersistenciaException("Error al obtener la lista de empleados", e);
        }

        return empleados;
    }

    /**
     * Busca un empleado por su ID.
     * 
     * @param id El ID del empleado a buscar.
     * @return Empleado El empleado encontrado.
     * @throws PersistenciaException Si ocurre un error al buscar el empleado o si el ID es inválido.
     */
    @Override
    public Empleado buscarEmpleado(int id) throws PersistenciaException {
        if (id < 1) {
            throw new PersistenciaException("ID inválido");
        }

        String query = "SELECT * FROM empleados WHERE id = ?";
        Empleado empleado = null;

        try (Connection conn = conexion.crearConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                empleado = new Empleado(
                    rs.getInt("id"),
                    rs.getString("correo"),
                    rs.getString("contrasena"),
                    rs.getString("tipo")
                );
            } else {
                throw new PersistenciaException("Empleado no encontrado");
            }

        } catch (SQLException e) {
            throw new PersistenciaException("Error al buscar el empleado", e);
        }

        return empleado;
    }

    /**
     * Verifica la existencia de un administrador.
     * 
     * @param empleado El objeto Empleado a verificar.
     * @return boolean true si el administrador existe, false en caso contrario.
     * @throws PersistenciaException Si ocurre un error al verificar las credenciales del administrador o si el objeto empleado es nulo.
     */
    @Override
    public boolean existenciaAdmin(Empleado empleado) throws PersistenciaException {
        if (empleado == null) {
            throw new PersistenciaException("El objeto empleado es nulo");
        }

        String query = "SELECT COUNT(*) FROM Empleados WHERE correo = ? AND contrasena = ?";

        try (Connection conn = conexion.crearConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, empleado.getCorreo());
            stmt.setString(2, empleado.getContraseña());

            ResultSet rs = stmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return true;
            } else {
                throw new PersistenciaException("Credenciales inválidas");
            }

        } catch (SQLException e) {
            throw new PersistenciaException("Error al verificar las credenciales del administrador", e);
        }
    }
}

