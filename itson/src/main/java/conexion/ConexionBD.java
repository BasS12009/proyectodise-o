/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import interfaces.IConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase ConexionBD que implementa la interfaz IConexionBD.
 * Proporciona métodos para crear una conexión a la base de datos.
 * 
 * @author skevi
 */
public class ConexionBD implements IConexionBD {

    // Constante que define la dirección del servidor de la base de datos
    final String SERVER = "localhost";
    
    // Constante que define el nombre de la base de datos
    final String BASE_DATOS = "itson";
    
    // Cadena de conexión que combina la dirección del servidor y el nombre de la base de datos
    private final String CADENA_CONEXION = "jdbc:mysql://" + SERVER + "/" + BASE_DATOS;
    
    // Constante que define el nombre de usuario para la conexión a la base de datos
    final String USUARIO = "root";
    
    // Constante que define la contraseña para la conexión a la base de datos
    final String CONTRASEÑA = "Saymyname15";

    /**
     * Método que crea una conexión a la base de datos utilizando los parámetros definidos.
     * 
     * @return Connection La conexión creada a la base de datos.
     * @throws SQLException Si ocurre un error al crear la conexión.
     */
    @Override
    public Connection crearConexion() throws SQLException {
        // Se crea la conexión a la base de datos usando la cadena de conexión, usuario y contraseña
        Connection conexion = DriverManager.getConnection(CADENA_CONEXION, USUARIO, CONTRASEÑA);
        return conexion;
    }
}
