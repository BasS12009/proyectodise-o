/**
 * LogginFCD.java
 * 
 * Implementación de la fachada para el proceso de inicio de sesión.
 */

package fachada;

import control.LogginCTL;
import dtos.EmpleadoDTO;
import exception.CtlException;
import exception.FachadaException;
import interfaz.ILogginFCD;

/**
 * @author/(s):
 * Diana Sofia Bastidas Osuna - 245804,
 * Carlos Damian Garcia Bernal - 247614,
 * Kevin Jared Sánchez Figueroa - 240798,
 * Daniel Alejandro Castro Félix - 235294.
 */
public class LogginFCD implements ILogginFCD{

    private LogginCTL login;

    /**
     * Constructor de LogginFCD que inicializa el objeto login.
     */
    public LogginFCD() {
        this.login = new LogginCTL();
    }

    /**
     * Verifica si un empleado con el correo y la contraseña proporcionados existe en el sistema.
     * 
     * @param correo El correo del empleado.
     * @param contraseña La contraseña del empleado.
     * @return true si el empleado existe, false en caso contrario.
     * @throws FachadaException Si ocurre un error en la fachada durante la verificación.
     */
    @Override
    public boolean existe(String correo, String contraseña) throws FachadaException {   
        try{
        EmpleadoDTO empleado = new EmpleadoDTO(correo, contraseña);
        
        if (login.validar(correo, contraseña)) {
            if (login.existe(empleado)) {
            return true; 
            }
        } 
        }catch(CtlException ex){
            throw new FachadaException(ex.getMessage());
        }
        return false;
    }
}