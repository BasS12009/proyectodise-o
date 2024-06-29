/**
 * ILogginFCD.java
 * 
 * Interfaz que define los métodos para la fachada de inicio de sesión.
 */
package interfaz;

import exception.FachadaException;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public interface ILogginFCD {
    
    /**
     * Verifica si un empleado con el correo y la contraseña proporcionados existe en el sistema.
     * 
     * @param correo El correo del empleado.
     * @param contraseña La contraseña del empleado.
     * @return true si el empleado existe, false en caso contrario.
     * @throws FachadaException Si ocurre un error en la fachada durante la verificación.
     */
    public boolean existe(String correo, String contraseña) throws FachadaException;
            
}